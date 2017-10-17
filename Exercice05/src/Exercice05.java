//Ecrire un programme en Java permettant de copier le contenu d’un fichier dans un autre fichier.
import java.io.*;


public class Exercice05 {
    public static void main(String[] args)  {

        //Fichier d'entré et de sortie
        String in_File="./Exercice05/support/fichier1.txt";
        String out_File="./Exercice05/support/fichier2.txt";

        //Assigne fichier correspondant
        File fileSource = new File(in_File);
        File fileDest = new File(out_File);

        //Lire le fichier "reader" et ecrire dans celui de "writer"
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileSource));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileDest));
            String line;
            //ecrit s'il y a qqchose
            while (null != (line = reader.readLine())){
                writer.write(line);
                writer.newLine();
            }
            //ferme les flux
            reader.close();
            writer.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
            }
}
