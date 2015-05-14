package projetmiage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
 
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
 

public class Cal extends JPanel {
  /** The currently-interesting year (not modulo 1900!) */
  protected int yy;
 
  /** Currently-interesting month and day */
  protected int mm, dd;
 
  /** The buttons to be displayed */
  protected JButton labs[][];
 
  /** The number of day squares to leave blank at the start of this month */
  protected int leadGap = 0;
 
  /** A Calendar object used throughout */
  Calendar calendar = new GregorianCalendar();
 
  /** Today's year */
  protected final int thisYear = calendar.get(Calendar.YEAR);
 
  /** Today's month */
  protected final int thisMonth = calendar.get(Calendar.MONTH);
 
  /** One of the buttons. We just keep its reference for getBackground(). */
  private JButton b0;
 
  /** The month choice */
  private JComboBox monthChoice;
 
  /** The year choice */
  private JComboBox yearChoice;
 
  private JComboBox weekChoice;

  private Informations info;
  
  protected String moment="";
  
  public JPanel pan=new JPanel();
  
  public  static int daysInMonth;
  
  Calendrier calendrier;
  
  int jour,mois,annee;
  /**
   * Construct a Cal, starting with today.
   */
  Cal(Calendrier calendrier) {
      
    super();
    this.calendrier=calendrier;
    setYYMMDD(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
    buildGUI();
    recompute();
  }
 

  private void setYYMMDD(int year, int month, int today) {
    yy = year;
    mm = month;
    dd = today;
  }
 
  String[] months = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin",
      "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" };
 
  /** Build the GUI. Assumes that setYYMMDD has been called. */
 
  
  private void buildGUI() {
    getAccessibleContext().setAccessibleDescription(
        "Calendar not accessible yet. Sorry!");
    setBorder(BorderFactory.createEtchedBorder());
 
    setLayout(new BorderLayout());
 
    JPanel tp = new JPanel();
    tp.add(monthChoice = new JComboBox());
    for (int i = 0; i < months.length; i++)
        monthChoice.addItem(months[i]);
    monthChoice.setSelectedItem(months[mm]);
    monthChoice.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int i = monthChoice.getSelectedIndex();
            if (i >= 0) {
                mm = i;
                // System.out.println("Month=" + mm);
                recompute();
            }
        }
    });
    monthChoice.getAccessibleContext().setAccessibleName("Months");
    monthChoice.getAccessibleContext().setAccessibleDescription("Choose a month of the year");
    tp.add(yearChoice = new JComboBox());
    
  
    
    yearChoice.setEditable(true);
    for (int i = yy - 5; i < yy + 5; i++)
        yearChoice.addItem(Integer.toString(i));
    yearChoice.setSelectedItem(Integer.toString(yy));
    yearChoice.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int i = yearChoice.getSelectedIndex();
            if (i >= 0) {
                yy = Integer.parseInt(yearChoice.getSelectedItem().toString());
                recompute();
            }
        }
    });
        
   // On crée un Calendar qu'on initialise à la Date souhaité :
    GregorianCalendar gc = new GregorianCalendar();
    gc.clear(); // on efface tous les champs
    // Et on se positionne le 31 décembre de l'année :
    gc.set(yy, Calendar.DECEMBER, 31);
 
    // On récupère le numéro de la semaine du jour
    int numSemaine = gc.get(Calendar.WEEK_OF_YEAR);
    // Et tant que celui-ci est inférieur ou égal à 1
    while (numSemaine <= 1) {
        // On enlève un jour :
        gc.add(Calendar.DATE, -1);
        // Et on récupère a NOUVEAU le numéro de la semaine :
        numSemaine = gc.get(Calendar.WEEK_OF_YEAR);
    }
    System.out.println("nombre semaine "+numSemaine);
    
    tp.add(weekChoice = new JComboBox());
    for (int i = 1; i <= numSemaine ; i++)
        weekChoice.addItem("Semaine "+i);
    
   
    add(BorderLayout.CENTER, tp);
    
    JPanel bp = new JPanel();
    bp.setLayout(new GridLayout(7,7));
    labs = new JButton[6][7]; 

    // first row is days
 
    bp.add(b0 = new JButton("D"));
    bp.add(new JButton("L"));
    bp.add(new JButton("M"));
    bp.add(new JButton("M"));
    bp.add(new JButton("J"));
    bp.add(new JButton("V"));
    bp.add(new JButton("S"));
 
    ActionListener dateSetter = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String num = e.getActionCommand();
            if (!num.equals("")) {
                jour=Integer.parseInt(num);
                mois=(mm+1);
                annee=yy;
                System.out.println(num+(mm+1)+yy);
                setDayActive(Integer.parseInt(num));
               //info = new Informations();
             
            }
        }
    };
 
    // Construct all the buttons, and add them.
    for (int i = 0; i < 6; i++)
        for (int j = 0; j < 7; j++) {
            bp.add(labs[i][j] = new JButton(""));
            
            labs[i][j].addActionListener(dateSetter);
        }
    add(BorderLayout.SOUTH, bp);
 }
 
  public final static int dom[] = { 
                                        31, 28, 31, 30, /* jan feb mar apr */
                                        31, 30, 31, 31, /* may jun jul aug */
                                        30, 31, 30, 31 /* sep oct nov dec */
  };
 
  /** Compute which days to put where, in the Cal panel */
  protected void recompute() {
    // System.out.println("Cal::recompute: " + yy + ":" + mm + ":" + dd);
    
    if (mm < 0 || mm > 11)
      throw new IllegalArgumentException("Month " + mm + " bad, must be 0-11");
    clearDayActive();
   
    // Compute how much to leave before the first.
    // getDay() returns 0 for Sunday, which is just right.
    leadGap = new GregorianCalendar(yy, mm, 1).get(Calendar.DAY_OF_WEEK) - 1;
    //System.out.println("leadGap = " + leadGap);
 
    daysInMonth = dom[mm];
    System.out.println(daysInMonth);
    /*if (isLeap(calendar.get(Calendar.YEAR)) & mm > 1)
        ++daysInMonth;
    */
    //System.out.println("daysInMonth = " + daysInMonth);

    // Afficher bouton vide jusqu'au premier jour du mois
   
    for (int i = 0; i < 6; i++)
        for (int j = 0; j < 7; j++) {
            labs[i][j].setText("");
            
        }
    
    for (int i = 0; i < leadGap; i++) {
        labs[0][i].setText("");
    }
    
 
    // Fill in numbers for the day of month.
   //System.out.println(leadGap+1-1%7);
    for (int i = 1; i <= daysInMonth; i++) {
      JButton b = labs[(leadGap + i - 1) / 7][(leadGap + i - 1) % 7];
      //System.out.println((leadGap+i-1)/7);
      //System.out.println((leadGap+i-1)%7);

      b.setText(Integer.toString(i));
      

      repaint();
    }

    // 7 days/week * up to 6 rows
    /*for (int i = leadGap + 1 + daysInMonth; i < 6 * 7; i++) {
      labs[(i) / 7][(i) % 7].setText("");
    }*/
 
    // Shade current day, only if current month
   /* if (thisYear == yy &#038;& mm == thisMonth)
      setDayActive(dd); // shade the box for today*/
 
    // Say we need to be drawn on the screen
    repaint();
  }
 
  /**
   * isLeap() returns true if the given year is a Leap Year.
   *
   * "a year is a leap year if it is divisible by 4 but not by 100, except
   * that years divisible by 400 *are* leap years." -- Kernighan &#038; Ritchie,
   * _The C Programming Language_, p 37.
   */
  /*public boolean isLeap(int year) {
    if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0)
        return true;
    
    return false;
  }*/
 
  /** Set the year, month, and day */
  public void setDate(int yy, int mm, int dd) {
    // System.out.println("Cal::setDate");
    this.yy = yy;
    this.mm = mm; // starts at 0, like Date
    this.dd = dd;
    recompute();
  }
 
  /** Unset any previously highlighted day */
  private void clearDayActive() {
    JButton b;
 
    // First un-shade the previously-selected square, if any
    if (activeDay > 0) {
      b = labs[(leadGap + activeDay - 1) / 7][(leadGap + activeDay - 1) % 7];
      b.setBackground(b0.getBackground());
      b.repaint();
      activeDay = -1;
    }
  }
 
  private int activeDay = -1;
 
  /** Set just the day, on the current month */
  public void setDayActive(int newDay) {
 
    clearDayActive();
 
    // Set the new one
    if (newDay <= 0)
      dd = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
    else
      dd = newDay;
    // Now shade the correct square
    Component square = labs[(leadGap + newDay - 1) / 7][(leadGap + newDay - 1) % 7];
    square.setBackground(Color.red);
    square.repaint();
    activeDay = newDay;
  }
 
  /** La méthode principale*/
/*  public static void main(String[] argv)
  {
    JFrame f = new JFrame("Mon Calendrier");
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
 
    // Initialiser un calendrier avec la date SUIVANT
    //c.add(new Cal(1990, 2, 15));
 
    // and beside it, the current month.
    c.add(new Cal());
 
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }*/
}