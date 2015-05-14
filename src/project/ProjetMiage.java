/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
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
    Informations inf=new Informations();
    Cal calendrier = new Cal();
    //JPanel p=new JPanel();
     Object[][] data = {
      {"", " "}
    };

    //Les titres des colonnes
    String  title[] = {"Matiné", "Soir"};
    JTable tableau = new JTable(data, title);
    //Nous ajoutons notre tableau à notre contentPane dans un scroll
    //Sinon les titres des colonnes ne s'afficheront pas !
    
    public ProjetMiage(){
    
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Planning");
    this.setSize(550, 1000);

    //p.add(tableau);
    this.getContentPane().add(new JScrollPane(tableau),BorderLayout.CENTER);
    this.getContentPane().add(calendrier,BorderLayout.EAST);
    this.getContentPane().add(inf,BorderLayout.SOUTH);
    inf.valider.addActionListener(this);
    
  }   
  
  public void actionPerformed(ActionEvent e) {
       String module=inf.getModule();
       String moment=inf.getTime();
       if (moment=="matin")
            data[0][0]=module;
       if(moment=="apresmidi")
            data[0][1]=module;
        tableau.repaint();
        
       
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