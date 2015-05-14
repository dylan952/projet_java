/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Seif
 */
public class Evenement implements Serializable{
    private  static  final  long serialVersionUID =  95200L;

    
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

    @Override
    public String toString() {
        return "Evenement{" + "date=" + date + ", moment=" + moment + ", module=" + module + '}';
    }
    

}
