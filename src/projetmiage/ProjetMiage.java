/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Seif
 */

     
 //CTRL + SHIFT + O pour générer les imports
public class ProjetMiage extends JFrame implements ActionListener{
   static DeserializationCalendrier deserialize = new DeserializationCalendrier();
   SerializationCalendrier serialize = new SerializationCalendrier();
    
    Calendrier calendr;
    Informations inf;
    Cal calendrier;
    Tableau table;
    
   
    //Nous ajoutons notre tableau à notre contentPane dans un scroll
    //Sinon les titres des colonnes ne s'afficheront pas !
    
    public ProjetMiage(){
        if (deserialize.getDeserilizedCalendrier() != null){
            calendr = deserialize.getDeserilizedCalendrier();
            inf = new Informations(calendr);
            calendrier = new Cal(calendr);
            table= calendrier.t;
        }
        else
        {
            calendr = new Calendrier();
            inf=new Informations(calendr);
            calendrier = new Cal(calendr);
            table= calendrier.t;
        }
      
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Planning");
    this.setSize(550, 1000);
    this.getContentPane().add(new JScrollPane(table.tableau),BorderLayout.CENTER);
    
    JButton save = new JButton("save");
    save.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        serialize.serializeCalendar(calendr);
        }
    });
    
    
    this.getContentPane().add(save, BorderLayout.WEST);
    
    this.getContentPane().add(calendrier,BorderLayout.EAST);
    this.getContentPane().add(inf,BorderLayout.SOUTH);
    inf.valider.addActionListener(this);
    table.tableau.setBackground(Color.white);
   
  }   
    
    
  
  public void actionPerformed(ActionEvent e) {


      
       String module=inf.getModule();
       String moment=inf.getTime();
       int a=calendrier.daysInMonth;
       String test = String.valueOf(a); 
       if (moment=="matin" ){
           if(module=="vide")
               table.data[0][0]="";
           else
            table.data[0][0]=module;
       }
       if(moment=="apresmidi"){
           if(module=="vide")
               table.data[0][1]="";
           else
               table.data[0][1]=module;
       }
        table.tableau.repaint();
               
        Calendar calendar=Calendar.getInstance();
        System.out.println("DD:"+calendrier.jour);
        calendar.set(Calendar.DAY_OF_MONTH, calendrier.jour);
        calendar.set(Calendar.MONTH, calendrier.mm);
        calendar.set(Calendar.YEAR, calendrier.yy);
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        String date=formatDate.format(calendar.getTime());
        
        inf.donnee=inf.getTime();
        inf.donnee+=inf.getModule();
        Evenement evenement = new Evenement(date, moment, module); 
        
        inf.calendrier.getEvements().add(evenement);
        
        for (int i = 0; i < inf.calendrier.getEvements().size(); i++) {
        System.out.println("Taille : "+inf.calendrier.getEvements().size());
        System.out.println("Evenement : "+inf.calendrier.getEvements().get(i).getMoment());
        System.out.println("Evenement date: "+inf.calendrier.getEvements().get(i).getDate());
      }

    }
  
 
  public static void main(String[] args){

    ProjetMiage fen = new ProjetMiage();
    fen.setVisible(true);
    fen.setLocation(0, 0);
    fen.pack();
    //fen.setData();
    fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }   

    
}
