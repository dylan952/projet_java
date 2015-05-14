package projetmiage;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import projetmiage.*;

public class DeserializationCalendrier {
    
    public Calendrier getDeserilizedCalendrier(){
     		Calendrier c = null;
		try {
			// ouverture d'un flux d'entrée depuis le fichier "personne.serial"
			FileInputStream fis = new FileInputStream("calendrier.serial");
			// création d'un "flux objet" avec le flux fichier
			ObjectInputStream ois= new ObjectInputStream(fis);
			try {	
				// désérialisation : lecture de l'objet depuis le flux d'entrée
				c = (Calendrier) ois.readObject(); 
			} finally {
				// on ferme les flux
				try {
					ois.close();
				} finally {
					fis.close();
				}
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		if(c != null) {
			System.out.println(c + " a ete deserialise");
                        return c;
		}   
                return null;
    }
}