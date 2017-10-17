//Ecrire un programme en Java permettant de copier le contenu d’un fichier dans un autre fichier.
import java.io.*;


public class Exercice05 {
    public static void main(String[] args)  {

        String in_File="./Exercice05/support/fichier1.txt";
        String out_File="./Exercice05/support/fichier2.txt";

        InputStreamReader file = new InputStreamReader(Exercice05.class.getResourceAsStream(in_File));

        BufferedReader readFile = new BufferedReader(file);


        try {
            FileWriter writeFile = new FileWriter(new File(out_File));
            while (readFile.ready()){
                writeFile.write(readFile.readLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
