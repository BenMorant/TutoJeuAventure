package jeuAventureTextuel;

import java.util.Scanner;

public class Jeu1et2 {

    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);

        String playerName;

        System.out.println("Veuillez indiquer notre nom");

        playerName = myScanner.nextLine();

        System.out.println("Hello " + playerName);

        System.out.println("Veuillez indiquer un nom");

        int number = myScanner.nextInt();

        System.out.println("Le nombre que vous avez indiqué est " + number);


        System.out.println("Vous marchez dans la forêt.");

        String myWeapon = "Epée rouillée";
        String myArmor = "Tunique en cuir";

        System.out.println("Votre arme actuelle est " + myWeapon);
        System.out.println("Votre armure actuelle est " + myArmor);

        int yourHp = 10;

        System.out.println("Vos points de vie actuels sont " + yourHp);

        System.out.println("Un monstre vous a attaqué et vous a fait un dommage de 4.");

        yourHp = yourHp - 4;

        System.out.println("Vos points de vie actuels sont " + yourHp);

    }

}
