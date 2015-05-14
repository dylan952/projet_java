/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Seif
 */
public class Informations extends JPanel implements ActionListener{
    
            JButton valider;
            JButton annuler;
            ButtonGroup groupe1;
            ButtonGroup groupe2;
            JRadioButton matin;
            JRadioButton vide;
            JRadioButton apresmidi;
            protected static String donnee="";
            JRadioButton math,francais,java,reseaux,anglais,bdd;
            public static String donnees;
            Calendrier calendrier;

                    
            public Informations(Calendrier calendrier){
                
                this.calendrier=calendrier;
                this.setLayout(new BorderLayout());
                valider = new JButton("Valider");
                annuler = new JButton("Annuler");
                
                matin = new JRadioButton("Matin");
                apresmidi = new JRadioButton("Apres-midi");
                groupe1 = new ButtonGroup();
                groupe1.add(matin);
                groupe1.add(apresmidi);
                
                vide=new JRadioButton("vide");
                math = new JRadioButton("Math");
                francais = new JRadioButton("Francais");
                java = new JRadioButton("Java");
                bdd = new JRadioButton("Bdd");
                anglais = new JRadioButton("Anglais");
                reseaux = new JRadioButton("Reseaux");
                groupe2 = new ButtonGroup();
                groupe2.add(vide);
                groupe2.add(math);
                groupe2.add(francais);
                groupe2.add(java);
                groupe2.add(bdd);
                groupe2.add(anglais);
                groupe2.add(reseaux);
               
                this.add(matin);
                this.add(apresmidi);
                                
                

                JPanel b1 = new JPanel();
                //On définit le layout en lui indiquant qu'il travaillera en ligne
                b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
                b1.add( matin);
                b1.add(apresmidi);
                
                JPanel b2 = new JPanel();
                //Idem pour cette ligne
                b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
                b2.add(vide);
                b2.add(math);
                b2.add(francais);
                b2.add(anglais);
                b2.add(java); 
                b2.add(bdd);
                b2.add(reseaux);
                
                JPanel b3 = new JPanel();
                
                b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
                b3.add(valider);
                b3.add(annuler);
                
                JPanel b4 = new JPanel();
                //On positionne maintenant ces trois lignes en colonne
                b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
                b4.add(b1);
                b4.add(b2);
                b4.add(b3);
		this.add(b4);
                
                this.setSize(550, 250);
                
                
                valider.addActionListener(this); 
        
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == valider) {
                  //donnee=  this.getTime();
                  //donnee+=this.getModule();
                  
                 
                  
                  //System.out.print(donnee);
                }
				
                if(e.getSource() == annuler) {
                   
                }
                
            }
            
            public String getDonnee(){
                return donnee;
            }
            public String getTime(){
                String moment="";
                if(matin.isSelected())
                    moment="matin";
                if(apresmidi.isSelected())
                    moment="apresmidi";
                return moment;
                    
            }
            
            public String getModule(){
                String mod="";
                if(math.isSelected())
                    mod="math";
                if(java.isSelected())
                    mod="java";
                if(bdd.isSelected())
                    mod="bdd";
                if(anglais.isSelected())
                    mod="anglais";
                if(reseaux.isSelected())
                    mod="reseaux";
                if(francais.isSelected())
                    mod="francais";
                if(vide.isSelected())
                    mod="vide";
                
                return mod;
                    
            }
            
}
