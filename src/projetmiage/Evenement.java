/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;
import java.util.Date;
/**
 *
 * @author Seif
 */
public class Evenement {
    
    private final String date;
    private final String moment;
    private final String module;
    
   // private final Evenement matin;
   // private final Evenement apresmidi;
    

    public Evenement(String date, String moment, String module) {
        this.date = date;
        this.moment = moment;
        this.module = module;
    }

    public String getDate() {
        return date;
    }

    public String getMoment() {
        return moment;
    }

    public String getModule() {
        return module;
    }
    

}
