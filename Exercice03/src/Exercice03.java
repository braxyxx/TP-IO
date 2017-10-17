//Ecrire un programme en Java permettant de lister tous les fichiers finissant avec l’extension
//de votre choix (ex: .py, .php, .txt) dans un répertoire donné via le scanner.

import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;

public class Exercice03 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //recupere chemin acces
        System.out.println("Ecrire le chemin d'acces");
        String path = sc.nextLine();

        //recupere extension de fichier
        System.out.println("Ecrire l'extension des fichier recherché");
        String extension = sc.nextLine();

        //tableau de fichier
        File file = new File(path);
        // filtre avec filenameFiltrer
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) { //verifie l'extension
                return name.endsWith(extension);
            }
        });

        if(files.length != 0) {
            //affiche les fichier du chemin avec extension
            for (File fileItem : files) {
                System.out.println(fileItem);
            }
        }
        else
            System.out.println("Aucun fichier trouver avec l'extension " + extension + "demandé");
    }
}
