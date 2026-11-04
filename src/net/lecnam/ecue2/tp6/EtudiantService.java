package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
}