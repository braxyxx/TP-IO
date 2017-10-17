//Ecrire un programme en Java permettant d’écrire dans un fichier tout ce que vous taperez
//dans le scanner, ligne par ligne. Le mot clé pour quitter sera ‘quit’

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exercice04 {

    public static Scanner sc = new Scanner(System.in);

    public static File file = new File("./Exercice04/support/exo.txt");


    public static void main(String[] args) {
        String saisie = "";

        while (!saisie.equals("quit")){
            //recupere la saisie par scanner
            saisie = sc.nextLine();

            if (!saisie.equals("quit")){
                try(FileWriter writer = new FileWriter(file,true);) {
                    saisie = saisie + "\n";
                    writer.write(saisie);
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
