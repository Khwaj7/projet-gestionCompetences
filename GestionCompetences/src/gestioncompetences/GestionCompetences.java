/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import static gestionFichiers.Lecteur.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author phili
 */
public class GestionCompetences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String personnePath = "C:\\Users\\entrax\\Documents\\GitHub\\projet-gestionCompetences\\fichiers_projet\\liste_personnel.csv";
        String competencesPath = "C:\\Users\\entrax\\Documents\\GitHub\\projet-gestionCompetences\\fichiers_projet\\liste_competences.csv";
        String competencePersonnesPath = "C:\\Users\\entrax\\Documents\\GitHub\\projet-gestionCompetences\\fichiers_projet\\competences_personnel.csv";

        ArrayList<Personne> personnel = getPersonnel(personnePath);
        ArrayList<Competence> competences = getCompetences(competencesPath);

        for (Personne personne : personnel) {
            //System.out.println(personne.toString());
            personne.addCompetence(lireFichierCompetencesParPersonne(competencePersonnesPath));
            //System.out.println(personne.Competences);
            personne.getCompetences().forEach((comp) -> {
                //System.out.println(comp.toString());
            });
            //System.out.println("");
        }

        MissionPreparation missionPrep = new MissionPreparation(new Date(21, 2, 1994), 10, 5);
        missionPrep.addCompetence(competences.get(0), 5);
        missionPrep.addCompetence(competences.get(1), 1);
        missionPrep.addCompetence(competences.get(2), 1);
        missionPrep.addCompetence(competences.get(3), 1);

        MissionPreparation missionPrep2 = new MissionPreparation(new Date(21, 2, 1994), 10, 5);
        missionPrep2.addCompetence(competences.get(0), 1);
        missionPrep2.addCompetence(competences.get(1), 1);
        missionPrep2.addCompetence(competences.get(2), 4);
        missionPrep2.addCompetence(competences.get(3), 1);

        MissionPlanifiee missionPlanifiee = missionPrep.planifier();
        MissionPlanifiee missionPlanifiee2 = missionPrep2.planifier();
        HashMap<Personne, Integer> personneAffinites = missionPlanifiee.chercherAffinites(personnel);
        //System.out.println(personneAffinites);
        missionPlanifiee.multiSelectionAuto(personneAffinites);
        missionPlanifiee2.multiSelectionAutoSup(personnel);
        /*missionPlanifiee.addPersonne(competences.get(0), personnel.get(0));
        missionPlanifiee.addPersonne(competences.get(0), personnel.get(4));
        missionPlanifiee.addPersonne(competences.get(1), personnel.get(1));
        missionPlanifiee.addPersonne(competences.get(2), personnel.get(2));
        missionPlanifiee.addPersonne(competences.get(3), personnel.get(3));*/

        MissionEnCours missionEnCours = missionPlanifiee.commencer();
        System.out.println(missionEnCours.getAffectationDefinitive().toString());

        MissionEnCours missionEnCours2 = missionPlanifiee2.commencer();
        System.out.println(missionEnCours2.getAffectationDefinitive().toString());

    }

}
