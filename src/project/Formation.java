package project;

public class Formation {
    String nom ;
    ListModule liste ;
    float dureeTypeSeance ;
    
    public Formation(String nom, ListModule liste, float dureeTypeSeance){
        this.nom = nom ;
        this.liste = liste ;
        this.dureeTypeSeance = dureeTypeSeance ;
    }
    
    public void updateFormation(String nom, ListModule liste, float dureeTypeSeance){
        this.nom = nom ;
        this.liste = liste ;
        this.dureeTypeSeance = dureeTypeSeance ;
    }
    
    public void setNom(String nom){
        this.nom = nom ;
    }
    
    public void setListe(ListModule liste){
        this.liste = liste ;
    }
    
    public void setDureeTypeSeance(float dureeTypeSeance){
        this.dureeTypeSeance = dureeTypeSeance ;
    }
}
