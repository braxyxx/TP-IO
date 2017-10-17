//Ecrire un programme en Java permettant de lister tous les fichiers dans un répertoire donné via le scanner.

import java.util.Scanner;
import java.io.File;

public class Exercice02 {

    private static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {

        //recupere chemin acces
        System.out.println("Ecrire le chemin d'acces");
        String path = sc.nextLine();
        
        File file = new File(path);
        //tableau de fichier
        File[] files = file.listFiles();

        for (File fileItem: files != null ? files : new File[0]) {
            //affiche les fichier du chemin
            if (fileItem.isFile()) {
                System.out.println("Fichier : " + fileItem);
            }
        }
    }
}

