/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author Seif
 */
public class Calendrier implements Serializable{
    
    private  static  final  long serialVersionUID =  95200L;
    
    private final ArrayList<Evenement> evenements = new ArrayList<>();
    
    public ArrayList<Evenement> getEvements(){
        return evenements;
    }
    
    public ArrayList<Evenement> getEvenement(String d){
        ArrayList<Evenement> result = new ArrayList<>();
        for (int i = 0; i < evenements.size(); i++) {
            if(evenements.get(i).getDate().equals(d)){
                result.add(evenements.get(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Calendrier{" + "evenements=" + evenements + '}';
    }
    
}
