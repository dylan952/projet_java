/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
public class Module {
    String nom, abbreviation, couleur;
    int nbSeances;
    
    public Module(String pnom, String pabbreviation, String pcouleur, int pnbSeances){
        this.nom = pnom;
        this.abbreviation = pabbreviation;
        this.couleur = pcouleur;
        this.nbSeances = pnbSeances;
    }
    
    public void updateModule(String pnom, String pabbreviation, String pcouleur, int pnbSeances){
        this.nom = pnom;
        this.abbreviation = pabbreviation;
        this.couleur = pcouleur;
        this.nbSeances = pnbSeances;
    }
    
    public void setNbseance(int pNbSeances){
        this.nbSeances = pNbSeances;
    }
    
    public void setCouleur(String pCouleur){
        this.couleur = pCouleur;
    }
    
    public void setAbbreviation(String pAbbreviation){
        this.abbreviation = pAbbreviation;
    }
    
    public void setNom(String pnom){
    this.nom = pnom;
    }
}
