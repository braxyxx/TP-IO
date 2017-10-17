import java.util.Scanner;
import java.io.File;



public class Exercice01 {

    private static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {

        //recupere chemin acces
        System.out.println("Ecrire le chemin d'acces");
        String path = sc.nextLine();

        File file = new File(path);

        try {
            //Test pour savoir si c'est un fichier
            if (file.isFile()){
                System.out.println("C'est un fichier");
            }
            //Test pour savoir si c'est un répertoire
            else if (file.isDirectory()){
                System.out.println("C'est un répertoire");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
