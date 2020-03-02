package jeuAventureTextuel;

import java.util.Random;
import java.util.Scanner;

public class Jeu3 {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHp;
    int choice;
    String playerName;
    String playerWeapon;
    int monsterHp;
    boolean silverRing = false;

    public static void main(String[] args) {

        Jeu3 game = new Jeu3();
        game.playerSetUp();
        game.townGate();
    }


    public void playerSetUp() {

        playerHp = 2;
        monsterHp = 15;

        playerWeapon = "Couteau";

        System.out.println("Vos HP = " + playerHp);
        System.out.println("Votre arme est " + playerWeapon);

        System.out.println("Veuillez indiquer votre nom :");
        playerName = myScanner.nextLine();
        System.out.println("Salut " + playerName + " ! C'est parti pour l'aventure !");
        enterScanner.nextLine();
    }

    public void townGate() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vous êtes à la porte de la Cité. \n Un garde se tient debout devant vous. \n Qu'est-ce que vous voulez faire ? \n \n \n ");
        System.out.println("1. Parler au garde");
        System.out.println("2. Attaquer le garde");
        System.out.println("3. Partir de là");
        System.out.println("--------------------------------------  \n");


        choice = myScanner.nextInt();

        if (choice == 1) {
            if (silverRing) {
                ending();
            } else {
                System.out.println("Garde: \" Bien le bonjour, étranger !" +
                        "\n ... Donc votre nom est " + playerName +
                        "\n Désolé mais vous ne pouvez pas entrer dans notre ville.");
                enterScanner.nextLine();
                townGate();
            }
        }
        if (choice == 2) {
            playerHp--;
            System.out.println("Garde: \"Hey ! Ne soyez pas stupide! \" " +
                    "\n Vous vous battez bravement mais le garde vous frappe fort et vous recevez un point de dommage");
            System.out.println("Vos points de vie actuels :" + playerHp);
            if (playerHp < 1) {
                dead();
            }
            if (playerHp > 0) {
                enterScanner.nextLine();
                townGate();
            }
        }
        if (choice == 3) {
            crossroad();
        } else {
            townGate();
        }
    }

    public void crossroad() {
        System.out.println("\n ------------------------------------------ \n");
        System.out.println("Vous êtes à un carrefour. Si vous allez au sud, vous serez de retour à la porte de la Cité. \n  Vous choisissez d'aller :");
        System.out.println("1. au nord");
        System.out.println("2. à l'est");
        System.out.println("3. au sud");
        System.out.println("4. à l'ouest");

        choice = myScanner.nextInt();

        if (choice == 1) {
            north();
        }
        if (choice == 2) {
            east();
        }
        if (choice == 3) {
            townGate();
        }
        if (choice == 4) {
            west();
        } else {
            crossroad();
        }
    }

    public void north() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés");
        playerHp = playerHp + 1;
        System.out.println("Vos points de vie = " + playerHp);
        System.out.println("\n \n 1. Vous retournez au carrefour.");
        System.out.println("--------------------------------------  \n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            crossroad();
        } else {
            north();
        }
    }

    public void east() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée.");
        playerWeapon = "longue épée";
        System.out.println("Votre nouvelle arme = " + playerWeapon);
        System.out.println("\n \n 1. Vous retournez au carrefour.");
        System.out.println("--------------------------------------  \n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            crossroad();
        } else {
            north();
        }
    }

    public void west() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vous tombez nez à nez sur un gobelin ! \n");
        System.out.println("1. Vous combattez");
        System.out.println("2. Vous fuyez");
        System.out.println("--------------------------------------  \n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            fight();
        }
        if (choice == 2) {
            crossroad();
        } else {
            west();
        }
    }

    public void fight() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vos points de vie = " + playerHp);
        System.out.println("Les points de vie du monstre = " + monsterHp);
        System.out.println("1. Vous combattez");
        System.out.println("2. Vous fuyez");
        System.out.println("--------------------------------------  \n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            attack();
        }
        if (choice == 2) {
            crossroad();
        } else {
            fight();
        }
    }

    public void attack() {
        int playerDamage = 0;
        if (playerWeapon.equals("couteau")) {
            playerDamage = new Random().nextInt(5);
        }
        if (playerWeapon.equals("longue épée")) {
            playerDamage = new Random().nextInt(8);
        }

        System.out.println("Vous attaquez un monstre et lui donnez" + playerDamage + " de dommage.");
        monsterHp = monsterHp - playerDamage;
        System.out.println("Les points de vie du monstre = " + monsterHp);
        if (monsterHp < 1) {
            win();
        }
        if (monsterHp > 0) {
            int monsterDamage = new Random().nextInt(4);
            System.out.println("Le monstre vous attaque et vous donne" + monsterDamage + " de dommage.");
            playerHp = playerHp - monsterDamage;
            System.out.println("Vos  points de vie = " + playerHp);
            if (playerHp < 1) {
                dead();
            } else if (playerHp > 0) {
                fight();
            }
        }
    }

    public void win() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vous avez tué le monstre \n");
        System.out.println("Le monstre a laché un anneau");
        System.out.println("Vous obtenez un anneau d'argent \n");
        silverRing = true;
        System.out.println("1. Vous allez à l'Est");
        System.out.println("--------------------------------------  \n");

        choice = myScanner.nextInt();
        if (choice == 1) {
            crossroad();
        } else {
            win();
        }
    }

    public void dead() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Vous êtes mort \n");
        System.out.println("GAME OVER");
        System.out.println("--------------------------------------  \n");
    }

    public void ending() {
        System.out.println("--------------------------------------  \n");
        System.out.println("Garde: \" Oh vous avez tué ce gobelin !!??? Super ! \" ");
        System.out.println("Garde: \" Vous semblez digne de confiance. Bienvenue dans notre cité \" ");
        System.out.println("\n   \n      ------------ FIN ------------ \n");

    }
}