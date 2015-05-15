package projetmiage.Accueil;
import java.awt.*;
import javax.swing.*;
import projetmiage.*;
import projetmiage.GestionModule.*;

/**
 *
 * @author Rayanouuu
 */
public class Accueil extends JFrame {
    
    public Accueil (){       
    JFrame fenetreAccueil = new JFrame();
    JButton jButtonCreerPlanning = new JButton("Créer un planning");
    JButton jButtonOuvrirPlanning = new JButton("Ouvrir un planning");
    JButton jButtonGererFormation = new JButton("Gérer formation et modules");
    JButton jButtonQuitter = new JButton("Quitter");
    
    this.setLayout(new BorderLayout());
    this.getContentPane().add(jButtonCreerPlanning, BorderLayout.NORTH);
    this.getContentPane().add(jButtonOuvrirPlanning, BorderLayout.WEST);
    this.getContentPane().add(jButtonGererFormation, BorderLayout.EAST);
    this.getContentPane().add(jButtonQuitter, BorderLayout.SOUTH);
    
    jButtonCreerPlanning.addActionListener(new java.awt.event.ActionListener() {
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjetMiage projet = new ProjetMiage();
                projet.setSize(1000,600);
                projet.setLocationRelativeTo(null);
                projet.setVisible(true);
                
            }
        });
    
    jButtonOuvrirPlanning.addActionListener(new java.awt.event.ActionListener() {
        private DeserializationCalendrier deserialize = new DeserializationCalendrier();
        private Calendrier c = null;
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser choixFichier = new JFileChooser("./");
                choixFichier.setDialogTitle("Choix du planning à ouvrir");
                choixFichier.setFileSelectionMode(JFileChooser.FILES_ONLY);// fichiers seulement
                choixFichier.setAcceptAllFileFilterUsed(false);// ne pas mettre de filtre de fichier
                choixFichier.setApproveButtonText("Ouvrir le fichier"); //intitule du bouton
 
    if (choixFichier.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
        int index = -1;
            System.out.println(choixFichier.getSelectedFile().toString());
            c = deserialize.getDeserializedCalendrier();
            ProjetMiage projet = new ProjetMiage();
                projet.setSize(1000,600);
                projet.setLocationRelativeTo(null);
                projet.setVisible(true);
      }
    }
});
    
    jButtonGererFormation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            Module module = new Module("BDD", "BD", "JAUNE", 3);
            ListModule liste = new ListModule();
            liste.addModule(module);
            Formation formation = new Formation("L3", liste, 3);
            GestionFormation gf = new GestionFormation(formation);
            gf.setVisible(true);
            gf.setSize(400, 400);
            }
        });
    
    jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0); 
            }
        });

    this.setVisible(true);
    this.setSize(500,500);
    }
    
 public static void main(String[] args){       
    Accueil accueil = new Accueil();
}

}
