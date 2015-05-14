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
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Seif
 */

     
    //CTRL + SHIFT + O pour générer les imports
public class ProjetMiage extends JFrame implements ActionListener{
    Calendrier calendr=new Calendrier();
    Informations inf=new Informations(calendr);
    Cal calendrier = new Cal(calendr);
    
    Tableau table=new Tableau();
   
    //Nous ajoutons notre tableau à notre contentPane dans un scroll
    //Sinon les titres des colonnes ne s'afficheront pas !
    
    public ProjetMiage(){
      
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Planning");
    this.setSize(550, 1000);
    this.getContentPane().add(new JScrollPane(table.tableau),BorderLayout.CENTER);

    this.getContentPane().add(calendrier,BorderLayout.EAST);
    this.getContentPane().add(inf,BorderLayout.SOUTH);
    inf.valider.addActionListener(this);
    table.tableau.setBackground(Color.blue);
    
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
        calendar.set(Calendar.DAY_OF_MONTH, calendrier.jour);
        calendar.set(Calendar.MONTH, calendrier.mois);
        calendar.set(Calendar.YEAR, calendrier.yy);
        Date date=calendar.getTime();
        inf.donnee=inf.getTime();
        inf.donnee+=inf.getModule();
        Evenement evenement = new Evenement(inf.donnee,date);        
        inf.calendrier.getEvements().add(evenement);
        
        System.out.println("Taille : "+inf.calendrier.getEvements().size());
        System.out.println("Evenement : "+inf.calendrier.getEvements().get(0).getTitre());
        System.out.println("Evenement date: "+inf.calendrier.getEvements().get(0).getDate());
    }
  
 
  public static void main(String[] args){
    ProjetMiage fen = new ProjetMiage();

    fen.setVisible(true);
    
    fen.pack();
    //fen.setData();
    fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fen.setVisible(true);
  
  }   
    
}