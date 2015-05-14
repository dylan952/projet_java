/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Date;
/**
 *
 * @author Seif
 */
public class Evenement {
    
    private final Date date;
    private final String titre;
    
    public Evenement(final String titre,final Date date){
        this.date=date;
        this.titre=titre;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public Date getDate(){
        return this.date;
    }
}
