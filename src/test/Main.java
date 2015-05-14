/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import project.Evenement;
import project.Calendrier;
import java.util.*;

/**
 *
 * @author Seif
 */
public class Main {
    
    public static void main(final String[] args){
        
        Calendrier calendrier=new Calendrier();
        
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.MONTH, 5);
        calendar.set(Calendar.YEAR, 2014);
        Date date=calendar.getTime();
        System.out.println(date);
        Evenement evenement = new Evenement("Titre",date);
        

        calendrier.getEvements().add(evenement);
        
        System.out.println(calendrier.getEvements().get(0).getDate().getDay());
    }
    
}
