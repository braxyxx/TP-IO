import java.util.Scanner;
import java.io.File;



public class Exercice01 {

    public static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {

        System.out.println("Ecrire le chemin d'acces");

        String path = sc.nextLine();
        File file = new File(path);

        try {
            if (file.isFile()){
                System.out.println("C'est un fichier");
            }
            else if (file.isDirectory()){
                System.out.println("C'est un répertoire");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
