import domain.*;
import service.*;

import java.util.Scanner;


public class Salaires {

    private static Scanner sc = new Scanner(System.in);
    public static Menu menu = new Menu();
    public static boolean quit = false;

    public static void main(String[] args) {

        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println(String.format(
                "Le salaire moyen dans l'entreprise est de %.2f francs.",
                p.salaireMoyen()
        ));
    }

    public static void luncher (Personnel p){
        String saisie ="";
        while (!quit){ //initialiser a false
            saisie = sc.nextLine();
            menu.displayMenu();
            switch (saisie.toLowerCase()){
                case "q" :
                    quit = true; //sortie du menu
                    break;
                case "s" :
                    p.ajouterEmploye();
            }
        }
    }
}
