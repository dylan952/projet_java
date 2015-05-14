/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;
import java.util.*;
/**
 *
 * @author Seif
 */
public class Calendrier {
    
    private final ArrayList<Evenement> evenements = new ArrayList<>();
    
    public ArrayList<Evenement> getEvements(){
        return evenements;
    }
    
    public Evenement[] getEvenement(String d){
        Evenement[] result = new Evenement[2];
        for (int i = 0; i < evenements.size(); i++) {
            if(evenements.get(i).getDate().equals(d)){
                result[i] = evenements.get(i);
            }
        }
        return result;
    }
    
}
