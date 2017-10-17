import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercice06 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        //récupere URL
        System.out.println("Saisissez l'url de l'image (JPG) :");
        String url = sc.nextLine();

        //saisie nom
        System.out.println("Saisissez le nom de l'image :");
        String name = sc.nextLine();

        try {
            //Récupere l'image via URL
            BufferedImage imgURL =  ImageIO.read(new URL(url));
            //Ajout image dans support
            ImageIO.write(imgURL, "jpg", new File("./Exercice06/support/"+name+".jpg"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
