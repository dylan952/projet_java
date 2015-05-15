package projetmiage;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import projetmiage.*;
import projetmiage.GestionModule.Formation;

public class Serialization {
    
    public void serializeFormation(Formation f){
        try {
                // création d'une personne
                System.out.println("creation de : " + f);

                // ouverture d'un flux de sortie vers le fichier "personne.serial"
                FileOutputStream fos = new FileOutputStream("formation.serial");

                // création d'un "flux objet" avec le flux fichier
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                try {
                        // sérialisation : écriture de l'objet dans le flux de sortie
                        oos.writeObject(f); 
                        // on vide le tampon
                        oos.flush();
                        System.out.println(f + " a ete serialise");
                } finally {
                        //fermeture des flux
                        try {
                                oos.close();
                        } finally {
                                fos.close();
                        }
                }
        } catch(IOException ioe) {
                ioe.printStackTrace();
        }
    }
    
    public void serializeCalendar(Calendrier c){
            try {
                // création d'une personne
                System.out.println("creation de : " + c);

                // ouverture d'un flux de sortie vers le fichier "personne.serial"
                FileOutputStream fos = new FileOutputStream("calendrier.serial");

                // création d'un "flux objet" avec le flux fichier
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                try {
                        // sérialisation : écriture de l'objet dans le flux de sortie
                        oos.writeObject(c); 
                        // on vide le tampon
                        oos.flush();
                        System.out.println(c + " a ete serialise");
                } finally {
                        //fermeture des flux
                        try {
                                oos.close();
                        } finally {
                                fos.close();
                        }
                }
        } catch(IOException ioe) {
                ioe.printStackTrace();
        }
    }

}