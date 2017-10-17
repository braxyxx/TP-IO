package service;

import java.util.Scanner;

public class Wizard {

    private static Scanner sc = new Scanner(System.in);
    public static boolean quit = false;
    private String employeFirstName ="";
    private String employeLastName = "";
    private int employeAge = 0;
    private int employeEntreYear = 0;
    private int employerSalary = 0;

    //display le menu d'employer
    public void displayWizard() {
        System.out.println("Votre choix ?");
        System.out.println("");
        System.out.println("1 : Type d'employé");
        System.out.println("2 : Prenom" + employeFirstName);
        System.out.println("3 : Nom" + employeLastName);
        System.out.println("4 : Age" + employeAge);
        System.out.println("5 : Année d'entrée" + employeEntreYear);
        System.out.println("6 : Unité" + employerSalary);
        System.out.println("7 : Sortie");
    }

    public void actionWizard(){
        String saisie ="";
        displayWizard();
        saisie = sc.nextLine();
        while (quit)
            //list des possibilité
        switch (saisie){
            case "1":
                employeType(); //Amene au choix des employé
                break;
            case "2":
                employeFirstName(); //Amene au scan pour rentrer le prenom
                break;
            case "3":
                employeFirstName(); //Amene au scan pour rentrer le nom
                break;
            case "4":
                employeAge(); //Amene au scan pour rentrer l'age
                break;
            case "5":
                employeEntreYear();//Amene au scan pour rentrer l'année d'entrée
                break;
            case "6":
                employerSalary(); //Amene au scan pour rentrer le salaire
                break;
            case "7":
                quit = true;
                break;
            default:
                System.out.println("Erreur de choix");
        }
    }

    private void employerSalary() {

    }

    private void employeEntreYear() {

    }

    private void employeAge() {

    }

    private void employeType() {

    }

    private void employeFirstName() {

    }
}
