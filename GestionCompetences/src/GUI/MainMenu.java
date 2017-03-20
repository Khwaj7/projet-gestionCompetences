/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import gestioncompetences.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Entrax
 */
public class MainMenu extends javax.swing.JFrame {

    private DetailsPersonne detailsPersonneUI;
    private DetailsMissionPreparation detailsMissionPreparationUI;
    private DetailsMissionPlanifiee detailsMissionPlanifieeUI;
    private DetailsMissionEnCours detailsMissionEnCoursUI;
    private DetailsMissionTerminee detailsMissionTermineeUI;
    private DetailsCompetence detailsCompetenceUI;

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        initComponents();
        ArrayList<Competence> competences = null;
        ArrayList<Personne> personnel = null;
        ArrayList<Mission> missions = null;
        try {
            competences = gestionFichiers.lecteur.getCompetences(gestionFichiers.lecteur.cheminCompetences);
            personnel = gestionFichiers.lecteur.getPersonnel(gestionFichiers.lecteur.cheminPersonnel);
            missions = gestionFichiers.lecteur.getMissions(gestionFichiers.lecteur.cheminMissions);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Competence cp : competences) {
            tableCompetencesModel.addRow(new Object[]{cp.getIdCompetence(), cp.getNomEN(), cp.getNomFR()});
        }
        for (Personne pers : personnel) {
            tablePersonneModel.addRow(new Object[]{pers.getId(), pers.getNom(), pers.getPrenom(), pers.getDateEntree()});
        }
        for (Mission miss : missions) {
            tableMissionModel.addRow(new Object[]{miss.getLibelle(), miss.getDateDebut(), miss.getDuree(), miss.getEtat()});
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
        jPanelMissions = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMissionModel = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Libellé", "Date de début", "Durée", "Etat"
            });
            jTableMissions = new javax.swing.JTable();
            detailsMissionButton = new javax.swing.JButton();
            ajouterMissionButton = new javax.swing.JButton();
            supprimerMissionButton = new javax.swing.JButton();
            sauvegarderMissionButton = new javax.swing.JButton();
            jPanelPersonnel = new javax.swing.JPanel();
            ajouterPersonneButton = new javax.swing.JButton();
            supprimerPersonneButton = new javax.swing.JButton();
            sauvegarderPersonneButton = new javax.swing.JButton();
            detailsPersonneButton = new javax.swing.JButton();
            jScrollPane3 = new javax.swing.JScrollPane();
            tablePersonneModel = new DefaultTableModel(
                new Object [][] {},
                new String [] {
                    "Identifiant", "Nom", "Prénom", "Date d'entrée"
                });
                jTablePersonne = new javax.swing.JTable();
                jPanelCompetences = new javax.swing.JPanel();
                ajouterCompetenceButton = new javax.swing.JButton();
                supprimerCompetenceButton = new javax.swing.JButton();
                sauvegarderCompetenceButton = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                tableCompetencesModel = new DefaultTableModel(
                    new Object [][] {},
                    new String [] {
                        "Identifiant", "Libellé EN", "Libellé FR"
                    });
                    jTableCompetences = new javax.swing.JTable();
                    detailsCompetenceBouton = new javax.swing.JButton();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setTitle("Gestion Personnel");

                    jTableMissions.setModel(tableMissionModel);
                    jScrollPane1.setViewportView(jTableMissions);

                    detailsMissionButton.setText("Détails");
                    detailsMissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            detailsMissionButtonMouseClicked(evt);
                        }
                    });

                    ajouterMissionButton.setText("Ajouter");
                    ajouterMissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            ajouterMissionButtonMouseClicked(evt);
                        }
                    });

                    supprimerMissionButton.setText("Supprimer");
                    supprimerMissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            supprimerMissionButtonMouseClicked(evt);
                        }
                    });

                    sauvegarderMissionButton.setText("Sauvegarder");
                    sauvegarderMissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            sauvegarderMissionButtonMouseClicked(evt);
                        }
                    });

                    javax.swing.GroupLayout jPanelMissionsLayout = new javax.swing.GroupLayout(jPanelMissions);
                    jPanelMissions.setLayout(jPanelMissionsLayout);
                    jPanelMissionsLayout.setHorizontalGroup(
                        jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMissionsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissionsLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(detailsMissionButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ajouterMissionButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(supprimerMissionButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sauvegarderMissionButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
                            .addContainerGap())
                    );
                    jPanelMissionsLayout.setVerticalGroup(
                        jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissionsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelMissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(detailsMissionButton)
                                .addComponent(ajouterMissionButton)
                                .addComponent(supprimerMissionButton)
                                .addComponent(sauvegarderMissionButton))
                            .addContainerGap())
                    );

                    jTabbedPane1.addTab("Missions", jPanelMissions);

                    ajouterPersonneButton.setText("Ajouter");
                    ajouterPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            ajouterPersonneButtonMouseClicked(evt);
                        }
                    });

                    supprimerPersonneButton.setText("Supprimer");
                    supprimerPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            supprimerPersonneButtonMouseClicked(evt);
                        }
                    });

                    sauvegarderPersonneButton.setText("Sauvegarder");
                    sauvegarderPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            sauvegarderPersonneButtonMouseClicked(evt);
                        }
                    });

                    detailsPersonneButton.setText("Détails");
                    detailsPersonneButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            detailsPersonneButtonMouseClicked(evt);
                        }
                    });

                    jTablePersonne.setModel(tablePersonneModel);
                    jScrollPane3.setViewportView(jTablePersonne);

                    javax.swing.GroupLayout jPanelPersonnelLayout = new javax.swing.GroupLayout(jPanelPersonnel);
                    jPanelPersonnel.setLayout(jPanelPersonnelLayout);
                    jPanelPersonnelLayout.setHorizontalGroup(
                        jPanelPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPersonnelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPersonnelLayout.createSequentialGroup()
                                    .addGap(0, 271, Short.MAX_VALUE)
                                    .addComponent(detailsPersonneButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ajouterPersonneButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(supprimerPersonneButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sauvegarderPersonneButton))
                                .addComponent(jScrollPane3))
                            .addContainerGap())
                    );
                    jPanelPersonnelLayout.setVerticalGroup(
                        jPanelPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPersonnelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPersonnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(detailsPersonneButton)
                                .addComponent(ajouterPersonneButton)
                                .addComponent(supprimerPersonneButton)
                                .addComponent(sauvegarderPersonneButton))
                            .addContainerGap())
                    );

                    jTabbedPane1.addTab("Personnel", jPanelPersonnel);

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

                    jTableCompetences.setModel(tableCompetencesModel);
                    jScrollPane2.setViewportView(jTableCompetences);

                    detailsCompetenceBouton.setText("Détails");
                    detailsCompetenceBouton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            detailsCompetenceBoutonMouseClicked(evt);
                        }
                    });

                    javax.swing.GroupLayout jPanelCompetencesLayout = new javax.swing.GroupLayout(jPanelCompetences);
                    jPanelCompetences.setLayout(jPanelCompetencesLayout);
                    jPanelCompetencesLayout.setHorizontalGroup(
                        jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(detailsCompetenceBouton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ajouterCompetenceButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(supprimerCompetenceButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sauvegarderCompetenceButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
                            .addContainerGap())
                    );
                    jPanelCompetencesLayout.setVerticalGroup(
                        jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sauvegarderCompetenceButton)
                                .addComponent(supprimerCompetenceButton)
                                .addComponent(ajouterCompetenceButton)
                                .addComponent(detailsCompetenceBouton))
                            .addContainerGap())
                    );

                    jTabbedPane1.addTab("Compétences", jPanelCompetences);

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

    private void detailsMissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMissionButtonMouseClicked
        // TODO add your handling code here:
        try {
            if (jTableMissions.getSelectedRow() != -1) {
                switch (tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 3).toString()) {
                    case "Préparation":
                        detailsMissionPreparationUI = new DetailsMissionPreparation(tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 0).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 1).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 2).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 3).toString()
                        );
                        detailsMissionPreparationUI.setVisible(true);
                        break;
                    case "Planifiée":
                        detailsMissionPlanifieeUI = new DetailsMissionPlanifiee(tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 0).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 1).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 2).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 3).toString()
                        );
                        detailsMissionPlanifieeUI.setVisible(true);
                        break;
                    case "En Cours":
                        detailsMissionEnCoursUI = new DetailsMissionEnCours(tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 0).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 1).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 2).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 3).toString()
                        );
                        detailsMissionEnCoursUI.setVisible(true);
                        break;
                    case "Terminée":
                        detailsMissionTermineeUI = new DetailsMissionTerminee(tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 0).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 1).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 2).toString(),
                                tableMissionModel.getValueAt(jTableMissions.getSelectedRow(), 3).toString()
                        );
                        detailsMissionTermineeUI.setVisible(true);
                        break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_detailsMissionButtonMouseClicked

    private void ajouterMissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMissionButtonMouseClicked
        // TODO add your handling code here:
        tableMissionModel.addRow(new Object[]{"", "", "", "Préparation"});
    }//GEN-LAST:event_ajouterMissionButtonMouseClicked

    private void supprimerMissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMissionButtonMouseClicked
        // TODO add your handling code here:
        if (jTableMissions.getSelectedRow() != -1) {
            tableMissionModel.removeRow(jTableMissions.getSelectedRow());
        }
        /*for (int selectedRow : jTableMissions.getSelectedRows()) {
            tableMissionModel.removeRow(selectedRow);
        }*/
    }//GEN-LAST:event_supprimerMissionButtonMouseClicked

    private void sauvegarderMissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvegarderMissionButtonMouseClicked
        // TODO add your handling code here:
        ArrayList<Mission> mission = new ArrayList<>();

        for (int i = 0; i < tableMissionModel.getRowCount(); i++) {
            String libelle = tableMissionModel.getValueAt(i, 0).toString();
            String dateDebut = tableMissionModel.getValueAt(i, 1).toString();
            String duree = tableMissionModel.getValueAt(i, 2).toString();
            String etat = tableMissionModel.getValueAt(i, 3).toString();

            mission.add(new Mission(libelle, dateDebut, duree, etat));
        }
        try {
            gestionFichiers.writer.sauvegarderMissions(mission);
        } catch (IOException e) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_sauvegarderMissionButtonMouseClicked

    private void detailsPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsPersonneButtonMouseClicked
        // TODO add your handling code here:
        try {
            if (jTablePersonne.getSelectedRow() != -1) {
                detailsPersonneUI = new DetailsPersonne(Integer.parseInt(tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 0).toString()),
                        tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 1).toString(),
                        tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 2).toString());
                detailsPersonneUI.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_detailsPersonneButtonMouseClicked

    private void ajouterPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterPersonneButtonMouseClicked
        // TODO add your handling code here:
        tablePersonneModel.addRow(new Object[]{Integer.parseInt(tablePersonneModel.getValueAt(jTablePersonne.getRowCount() - 1, 0).toString()) + 1, "", ""});
    }//GEN-LAST:event_ajouterPersonneButtonMouseClicked

    private void supprimerPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerPersonneButtonMouseClicked
        // TODO add your handling code here:
        if (jTablePersonne.getSelectedRow() != -1) {
            tablePersonneModel.removeRow(jTablePersonne.getSelectedRow());
        }
        /*for (int selectedRow : jTablePersonne.getSelectedRows()) {
            tablePersonneModel.removeRow(selectedRow);
        }*/
    }//GEN-LAST:event_supprimerPersonneButtonMouseClicked

    private void sauvegarderPersonneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvegarderPersonneButtonMouseClicked
        // TODO add your handling code here:
        ArrayList<Personne> personnel = new ArrayList<>();
        for (int i = 0; i < tablePersonneModel.getRowCount(); i++) {
            int id = (int) tablePersonneModel.getValueAt(i, 0);
            String nom = (String) tablePersonneModel.getValueAt(i, 1);
            String prenom = (String) tablePersonneModel.getValueAt(i, 2);
            String dateEntree = (String) tablePersonneModel.getValueAt(i, 3);

            personnel.add(new Personne(nom, prenom, dateEntree, id));
        }
        try {
            gestionFichiers.writer.sauvegarderPersonnel(personnel);

        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sauvegarderPersonneButtonMouseClicked

    private void ajouterCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterCompetenceButtonMouseClicked
        // TODO add your handling code here:
        tableCompetencesModel.addRow(new Object[]{"", "", ""});
    }//GEN-LAST:event_ajouterCompetenceButtonMouseClicked

    private void supprimerCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerCompetenceButtonMouseClicked
        // TODO add your handling code here:
        if (jTableCompetences.getSelectedRow() != -1) {
            tableCompetencesModel.removeRow(jTableCompetences.getSelectedRow());
        }
        /*for (int selectedRow : jTableCompetences.getSelectedRows()) {
            tableCompetencesModel.removeRow(selectedRow);
        }*/
    }//GEN-LAST:event_supprimerCompetenceButtonMouseClicked

    private void sauvegarderCompetenceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvegarderCompetenceButtonMouseClicked
        // TODO add your handling code here:
        ArrayList<Competence> competences = new ArrayList<>();

        for (int i = 0; i < tableCompetencesModel.getRowCount(); i++) {
            String id = tableCompetencesModel.getValueAt(i, 0).toString();
            String libEN = tableCompetencesModel.getValueAt(i, 1).toString();
            String libFR = tableCompetencesModel.getValueAt(i, 2).toString();

            competences.add(new Competence(id, libEN, libFR));
        }
        try {
            gestionFichiers.writer.sauvegarderCompetences(competences);

        } catch (IOException e) {
            Logger.getLogger(MainMenu.class
                    .getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_sauvegarderCompetenceButtonMouseClicked

    private void detailsCompetenceBoutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsCompetenceBoutonMouseClicked
        // TODO add your handling code here:
        //récupérer dans competences_personnel.csv le personnel ayant la compétence ciblée
        //"jointure" avec personnel.csv pour avoir nom, prenom, date_entree du personnel
        if (jTableCompetences.getSelectedRow() != -1) {
            //passer en paramètres les infos de la compétence
            int idSelected = jTableCompetences.getSelectedRow();
            jTableCompetences.getValueAt(idSelected, 1);
            detailsCompetenceUI = new DetailsCompetence((String)jTableCompetences.getValueAt(idSelected, 0));
            detailsCompetenceUI.setVisible(true);
        }
/* exemple pour personnes
        try {
            if (jTablePersonne.getSelectedRow() != -1) {
                detailsPersonneUI = new DetailsPersonne(Integer.parseInt(tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 0).toString()),
                        tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 1).toString(),
                        tablePersonneModel.getValueAt(jTablePersonne.getSelectedRow(), 2).toString());
                detailsPersonneUI.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_detailsCompetenceBoutonMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton ajouterMissionButton;
    private javax.swing.JButton ajouterPersonneButton;
    private javax.swing.JButton detailsCompetenceBouton;
    private javax.swing.JButton detailsMissionButton;
    private javax.swing.JButton detailsPersonneButton;
    private javax.swing.JPanel jPanelCompetences;
    private javax.swing.JPanel jPanelMissions;
    private javax.swing.JPanel jPanelPersonnel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCompetences;
    private javax.swing.JTable jTableMissions;
    private javax.swing.JTable jTablePersonne;
    private javax.swing.JButton sauvegarderCompetenceButton;
    private javax.swing.JButton sauvegarderMissionButton;
    private javax.swing.JButton sauvegarderPersonneButton;
    private javax.swing.JButton supprimerCompetenceButton;
    private javax.swing.JButton supprimerMissionButton;
    private javax.swing.JButton supprimerPersonneButton;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tableCompetencesModel;
    DefaultTableModel tablePersonneModel;
    DefaultTableModel tableMissionModel;
}
