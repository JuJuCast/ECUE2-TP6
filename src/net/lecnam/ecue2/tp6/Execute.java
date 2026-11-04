package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        exercice2();

        exercice3();

        exercice4();

        exercice5();

        //exercice6();

    }

    private static void exercice1(){
        Division d = new Division();
        double resultat = d.division1(10, 0);
        System.out.println("Résultat : " + resultat);
    }



    private static void exercice2(){
        Division d = new Division();
        double resultat = d.division2(10, 0);
        System.out.println("Résultat : " + resultat);
    }

    private static void exercice3(){
        Division d = new Division();
        try {
            double resultat = d.division3(10, 0);
            System.out.println("Résultat : " + resultat);
        } catch (IOException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }


    private static void exercice4(){
        Etudiant[] listeEtudiants = {
                new Etudiant("12345678A", "Forestier", "Julien"),
                new Etudiant("87654321B", "Dupont", "Marie"),
                new Etudiant("11223344C", "Martin", "Lucas")
        };

        EtudiantService service = new EtudiantService();
        try {
            service.sauve(listeEtudiants, "etudiants.csv");
            System.out.println("Fichier etudiants.csv généré avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la création du fichier : " + e.getMessage());
        }
    }

    private static void exercice5(){
        EtudiantService service = new EtudiantService();
        try {
            Etudiant[] etudiantsImportes = service.charge("etudiants.csv");
            System.out.println("--- Étudiants importés du fichier CSV ---");
            for (Etudiant e : etudiantsImportes) {
                System.out.println("Nom : " + e.getNom() + " | Prénom : " + e.getPrenom() + " | INE : " + e.getIne());
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    private static void exercice6(){


    }

}
