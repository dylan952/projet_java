package projetmiage.GestionModule;

import java.awt.Dimension;
import javax.swing.*;


public class GestionFormation extends JFrame {
 
       // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonModifierFormation;
    private javax.swing.JButton jButtonModifierListe;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabelDureeSeances;
    private javax.swing.JLabel jLabelListeModules;
    private javax.swing.JLabel jLabelNomFormation;
    private javax.swing.JList jListModules;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDureeSeances;
    private javax.swing.JTextField jTextFieldNomFormation;
    // End of variables declaration       
    
public GestionFormation(Formation formation) {
        jLabelNomFormation = new JLabel();
        jTextFieldNomFormation = new JTextField();
        jLabelDureeSeances = new JLabel();
        jTextFieldDureeSeances = new JTextField();
        jLabelListeModules = new JLabel();
        jScrollPane1 = new JScrollPane();
        jListModules = new JList();
        jButtonModifierListe = new JButton();
        jButtonModifierFormation = new JButton();
        jButtonValider = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNomFormation.setText("Nom de la formation :");
        

        jTextFieldNomFormation.setEditable(false);
        jTextFieldNomFormation.setText(formation.nom);

        jLabelDureeSeances.setText("Durée type des séances :");
        

        jTextFieldDureeSeances.setEditable(false);
        jTextFieldDureeSeances.setText(String.valueOf(formation.dureeTypeSeance));

        jLabelListeModules.setText("Liste des modules :");

        jListModules.setModel(new javax.swing.AbstractListModel() {
            String[] strings = formation.liste.getAllModules();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListModules);
        jListModules.setEnabled(false);

        jButtonModifierListe.setText("Modifier la liste");
        jButtonModifierListe.setVisible(false);
        jButtonModifierListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionModule gm = new GestionModule();
                gm.setVisible(true);
            }
        });

        jButtonModifierFormation.setText("Modifier");
        jButtonModifierFormation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomFormation.setEditable(true);
                jTextFieldDureeSeances.setEditable(true);
                jListModules.setEnabled(true);
                jButtonValider.setVisible(true);
                jButtonModifierFormation.setVisible(false);
                jButtonModifierListe.setVisible(true);            }
        });

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formation.updateFormation(jTextFieldNomFormation.getText(), formation.liste, Float.parseFloat( jTextFieldDureeSeances.getText()));
                jTextFieldNomFormation.setEditable(false);
                jTextFieldDureeSeances.setEditable(false);
                jListModules.setEnabled(false);
                jButtonValider.setVisible(false);
                jButtonModifierFormation.setVisible(true);
                jButtonModifierListe.setVisible(false);

            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelListeModules)
                                    .addComponent(jButtonModifierFormation))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jButtonModifierListe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jButtonValider))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNomFormation)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNomFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelDureeSeances)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldDureeSeances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomFormation))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDureeSeances)
                    .addComponent(jTextFieldDureeSeances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelListeModules)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifierListe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValider)
                    .addComponent(jButtonModifierFormation))
                .addContainerGap(12, Short.MAX_VALUE))
        );

}
    // </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void boutonEditerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
    }
    
    public static void main(String args[]) {
            Module module = new Module("BDD", "BD", "JAUNE", 3);
            ListModule liste = new ListModule();
            liste.addModule(module);
            Formation formation = new Formation("L3", liste, 3);
            GestionFormation gf = new GestionFormation(formation);
            gf.setVisible(true);  
            gf.setSize(400, 400);
    }
    
}

