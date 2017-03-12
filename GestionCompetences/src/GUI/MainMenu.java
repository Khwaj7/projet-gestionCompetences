/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import gestioncompetences.Competence;
import gestioncompetences.Personne;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Entrax
 */
public class MainMenu extends javax.swing.JFrame {

    private AjouterCompetence ajouterCompetenceUI = new AjouterCompetence();
    private AjouterPersonne ajouterPersonneUI = new AjouterPersonne();
    private DetailsPersonne detailsPersonneUI = new DetailsPersonne();

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        initComponents();
        ArrayList<Competence> competences = null;
        ArrayList<Personne> personnel = null;
        try {
            competences = gestionFichiers.lecteur.getCompetences("C:\\Users\\entrax\\Documents\\GitHub\\projet-gestionCompetences\\fichiers_projet\\liste_competences.csv");
            personnel = gestionFichiers.lecteur.getPersonnel("C:\\Users\\entrax\\Documents\\GitHub\\projet-gestionCompetences\\fichiers_projet\\liste_personnel.csv");
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Competence cp : competences) {
            listCompetencesModele.addElement(cp.toString());
        }
        for (Personne pers : personnel) {
            listPersonnelModele.addElement(pers.toString());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        ajouterPersonneButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPersonnelModele = new DefaultListModel();
        listPersonnel = new javax.swing.JList<>();
        supprimerPersonneButton = new javax.swing.JButton();
        sauvegarderPersonneButton = new javax.swing.JButton();
        detailsPersonneButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        paneMissions = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCompetencesModele = new DefaultListModel();
        listCompetences = new javax.swing.JList<>();
        ajouterCompetenceButton = new javax.swing.JButton();
        supprimerCompetenceButton = new javax.swing.JButton();
        sauvegarderCompetenceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        ajouterPersonneButton.setText("Ajouter");
        ajouterPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterPersonneButtonMouseClicked(evt);
            }
        });

        listPersonnel.setModel(listPersonnelModele);
        jScrollPane2.setViewportView(listPersonnel);

        supprimerPersonneButton.setText("Supprimer");
        supprimerPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerPersonneButtonMouseClicked(evt);
            }
        });

        sauvegarderPersonneButton.setText("Sauvegarder");

        detailsPersonneButton.setText("Détails");
        detailsPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsPersonneButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 270, Short.MAX_VALUE)
                        .addComponent(detailsPersonneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajouterPersonneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supprimerPersonneButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sauvegarderPersonneButton))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsPersonneButton)
                    .addComponent(ajouterPersonneButton)
                    .addComponent(supprimerPersonneButton)
                    .addComponent(sauvegarderPersonneButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personnel", jPanel2);

        javax.swing.GroupLayout paneMissionsLayout = new javax.swing.GroupLayout(paneMissions);
        paneMissions.setLayout(paneMissionsLayout);
        paneMissionsLayout.setHorizontalGroup(
            paneMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        paneMissionsLayout.setVerticalGroup(
            paneMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Missions", jPanel1);

        listCompetences.setModel(listCompetencesModele);
        jScrollPane1.setViewportView(listCompetences);

        ajouterCompetenceButton.setText("Ajouter");
        ajouterCompetenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterCompetenceButtonMouseClicked(evt);
            }
        });

        supprimerCompetenceButton.setText("Supprimer");
        supprimerCompetenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerCompetenceButtonMouseClicked(evt);
            }
        });

        sauvegarderCompetenceButton.setText("Sauvegarder");
        sauvegarderCompetenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sauvegarderCompetenceButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ajouterCompetenceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supprimerCompetenceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sauvegarderCompetenceButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sauvegarderCompetenceButton)
                    .addComponent(supprimerCompetenceButton)
                    .addComponent(ajouterCompetenceButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Compétences", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void ajouterPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterPersonneButtonMouseClicked
        // TODO add your handling code here:
        ajouterPersonneUI = new AjouterPersonne();
        ajouterPersonneUI.setVisible(true);
    }//GEN-LAST:event_ajouterPersonneButtonMouseClicked

    private void detailsPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsPersonneButtonMouseClicked
        // TODO add your handling code here:
        detailsPersonneUI = new DetailsPersonne();
        detailsPersonneUI.setVisible(true);
    }//GEN-LAST:event_detailsPersonneButtonMouseClicked

    private void ajouterCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterCompetenceButtonMouseClicked
        // TODO add your handling code here:
        ajouterCompetenceUI = new AjouterCompetence();
        ajouterCompetenceUI.setVisible(true);
    }//GEN-LAST:event_ajouterCompetenceButtonMouseClicked

    private void sauvegarderCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvegarderCompetenceButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sauvegarderCompetenceButtonMouseClicked

    private void supprimerCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerCompetenceButtonMouseClicked
        // TODO add your handling code here:
        listCompetencesModele.removeElementAt(listCompetences.getSelectedIndex());
    }//GEN-LAST:event_supprimerCompetenceButtonMouseClicked

    private void supprimerPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerPersonneButtonMouseClicked
        // TODO add your handling code here:
        listPersonnelModele.removeElementAt(listPersonnel.getSelectedIndex());
    }//GEN-LAST:event_supprimerPersonneButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterCompetenceButton;
    private javax.swing.JButton ajouterPersonneButton;
    private javax.swing.JButton detailsPersonneButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listCompetences;
    private javax.swing.JList<String> listPersonnel;
    private javax.swing.JPanel paneMissions;
    private javax.swing.JButton sauvegarderCompetenceButton;
    private javax.swing.JButton sauvegarderPersonneButton;
    private javax.swing.JButton supprimerCompetenceButton;
    private javax.swing.JButton supprimerPersonneButton;
    // End of variables declaration//GEN-END:variables
    DefaultListModel listCompetencesModele;
    DefaultListModel listPersonnelModele;
}