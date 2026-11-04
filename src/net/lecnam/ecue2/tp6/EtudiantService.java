package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EtudiantService {

    public void sauve(Etudiant[] etudiants, String cheminCompletFichier) throws IOException {
        Path chemin = Paths.get(cheminCompletFichier);

        if (Files.exists(chemin)) {
            Files.delete(chemin);
        }

        Files.createFile(chemin);

        for (Etudiant etudiant : etudiants) {
            Files.writeString(
                    chemin,
                    etudiant.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }

    }
    public Etudiant[] charge(String cheminCompletFichier) throws IOException {
        Path chemin = Paths.get(cheminCompletFichier);

        List<String> lignes = Files.readAllLines(chemin);

        Etudiant[] etudiants = new Etudiant[lignes.size()];

        for (int i = 0; i < lignes.size(); i++) {
            String ligne = lignes.get(i);

            String ligneNettoyee = ligne.replace("\"", "");
            String[] elements = ligneNettoyee.split(",");

            if (elements.length >= 3) {
                String ine = elements[0];
                String nom = elements[1];
                String prenom = elements[2];

                etudiants[i] = new Etudiant(ine, nom, prenom);
            }
        }

        return etudiants;
    }
}
