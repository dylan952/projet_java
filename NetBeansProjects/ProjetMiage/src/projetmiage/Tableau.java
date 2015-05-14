/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;

import javax.swing.JTable;

/**
 *
 * @author Seif
 */
public class Tableau {
    
     Object[][] data = {
      
      {"", " "}
      
    };
     

    //Les titres des colonnes
    String title[] = {"Matiné", "Soir"};
    JTable tableau = new JTable(data, title);
    
    
}
