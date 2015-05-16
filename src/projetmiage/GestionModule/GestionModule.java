/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage.GestionModule;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author D.SEVEUR-NOLEO
 */
public class GestionModule extends JFrame{
    public GestionModule(ListModule L){
        System.out.println(Color.getColor("yellow"));
        
        
    ListModule list = L;
    
        setSize(400, 250);
    
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JList listModule = new javax.swing.JList();
        JButton btnEditModule = new javax.swing.JButton();
        JButton btnAddModule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listModule.setModel(new javax.swing.AbstractListModel() {
            String[] strings = list.getAllModules();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listModule);

        btnEditModule.setText("Edit Module");
        btnEditModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(listModule.getSelectedIndex() != -1){
                    EditModule edit = new EditModule(list.getModule(listModule.getSelectedValue().toString()));
                    edit.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            listModule.setModel(new javax.swing.AbstractListModel() {
                            String[] strings = list.getAllModules();
                            public int getSize() { return strings.length; }
                            public Object getElementAt(int i) { return strings[i]; }
                            });
                    }
                });
                }
                else {JOptionPane.showMessageDialog(null, "Aucun Module choisi!");}
            }
        });

        btnAddModule.setText("Add Module");
        btnAddModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addModule add = new addModule(list);
                   
                    add.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            listModule.setModel(new javax.swing.AbstractListModel() {
                            String[] strings = list.getAllModules();
                            public int getSize() { return strings.length; }
                            public Object getElementAt(int i) { return strings[i]; }
                            });
                    }
                });
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditModule)
                    .addComponent(btnAddModule))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAddModule)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditModule)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }
   
}