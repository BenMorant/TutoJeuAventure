package JeuAventureSwing.gameMechanix;

import JeuAventureSwing.monsterz.Goblin;
import JeuAventureSwing.monsterz.Guard;
import JeuAventureSwing.monsterz.Mandragore;
import JeuAventureSwing.monsterz.PetitDragon;
import JeuAventureSwing.monsterz.SuperMonster;
import JeuAventureSwing.weaponz.LongSword;
import JeuAventureSwing.weaponz.WeaponKnife;

import java.util.Random;

import static JeuAventureSwing.gameMechanix.Game.getRandomNumberBetweenTwoBounds;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    SuperMonster monster;
    boolean silverRing;

    public Story(Game g, UI userInterface, VisibilityManager vManager) {

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {

        ui.getImage(ui.imageLabelPortrait, player.portrait);
        player.hpMax = getRandomNumberBetweenTwoBounds(7, 15);
        player.hp = player.hpMax;

        ui.hpLabelNumber.setText("" + player.hp);
        ui.hpMaxLabelNumber.setText("" + player.hpMax);

        player.mpMax = 0;
        player.mp = player.mpMax;

        ui.mpLabelNumber.setText("" + player.mp);
        ui.mpMaxLabelNumber.setText("" + player.mpMax);

        silverRing = false;

        player.currentWeapon = new WeaponKnife();
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.weaponLabelDamageMaxNumber.setText("" + player.currentWeapon.damageMax);

        player.strength = getRandomNumberBetweenTwoBounds(0, 10);
        player.hability = 10 - player.strength;
        ui.strengthLabelNumber.setText("" + player.strength);
        ui.habilityLabelNumber.setText("" + player.hability);
    }

    public void selectNextPosition(String nextPosition) {

        switch (nextPosition) {
            case "townGate":
                townGate();
                break;
            case "talkGuard":
                talkGuard();
                break;
            case "attackGuard":
                attackGuard();
                break;
            case "crossRoad":
                crossRoad();
                break;
            case "north":
                north();
                break;
            case "east":
                east();
                break;
            case "west":
                west();
                break;
            case "fight":
                fight();
                break;
            case "playerAttack":
                playerAttack();
                break;
            case "monsterAttack":
                monsterAttack();
                break;
            case "win":
                win();
                break;
            case "lose":
                lose();
                break;
            case "ending":
                ending();
                break;
            case "toTitle":
                toTitle();
                break;
        }
    }

    public void townGate() {
        ui.getImage(ui.imageLabelPrincipal, "places//cite.jpg");
        ui.mainTextArea.setText("Vous êtes aux portes de la Cité. \n Un garde se tient debout devant vous. \n Que voulez vous faire ? \n \n \n ");
        ui.choice1.setText("Parler au garde");
        ui.choice2.setText("Attaquer le garde");
        ui.choice3.setText("Partir de là");
        ui.choice4.setText("");

        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    public void talkGuard() {
        monster = new Guard();
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        if (!silverRing) {
            ui.mainTextArea.setText(monster.name + ": \" Bien le bonjour, étranger !\n Je ne vous ai jamais vu. \n Je suis désolé mais nous ne pouvons pas laisser  \n un étranger dans notre ville \"");
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "townGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (silverRing) {
            ending();
        }
    }


    public void attackGuard() {
        monster = new Guard();
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int dammageGuard = getRandomNumberBetweenTwoBounds(2, 4);
        ui.mainTextArea.setText(monster.name + " : \"Hey ! Ne soyez pas stupide!\" \n Vous vous battez bravement mais " + monster.theName + " vous frappe fort \net vous recevez " + dammageGuard + " points de dommage");
        player.hp = player.hp - dammageGuard;
        ui.hpLabelNumber.setText("" + player.hp);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "townGate";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void crossRoad() {
        ui.getImage(ui.imageLabelPrincipal, "places/crossroad.jpg");
        ui.mainTextArea.setText("Vous êtes à un carrefour. \nSi vous allez au sud, vous serez de retour aux portes de la Cité. \n  Vous choisissez d'aller :");
        ui.choice1.setText("au Nord");
        ui.choice2.setText("à l'Est");
        ui.choice3.setText("au Sud");
        ui.choice4.setText("à l'Ouest");

        game.nextPosition1 = "north";
        game.nextPosition2 = "east";
        game.nextPosition3 = "townGate";
        game.nextPosition4 = "west";

    }

    public void north() {
        ui.getImage(ui.imageLabelPrincipal, "places/riviere.jpeg");
        int riverRestore = getRandomNumberBetweenTwoBounds(1, 3);
        if (player.hp < (player.hpMax - 1)) {
            player.hp = player.hp + riverRestore;
            ui.hpLabelNumber.setText("" + player.hp);
            ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+" + riverRestore + ")");
        } else if (player.hp < player.hpMax) {
            player.hp = player.hp + 1;
            ui.hpLabelNumber.setText("" + player.hp);
            ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+1)");
        } else {
            ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont au maximum.");
        }

        ui.choice1.setText("Vous allez au Sud");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void east() {
        player.currentWeapon = new LongSword();
        ui.getImage(ui.imageLabelPrincipal, player.currentWeapon.image);
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.weaponLabelDamageMaxNumber.setText("" + player.currentWeapon.damageMax);
        ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n ( " + player.currentWeapon.damageMax + " dommage max )");
        ui.choice1.setText("Vous allez à l'Ouest");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void west() {
        int i = new Random().nextInt(100) + 1;

        if (i < 60) {
            monster = new Goblin();
        } else if (i < 90) {
            monster = new Mandragore();
        } else {
            monster = new PetitDragon();
        }
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        ui.mainTextArea.setText("Vous tombez nez à nez sur " + monster.aName + " !");
        ui.choice1.setText("Vous combattez");
        ui.choice2.setText("Vous fuyez");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fight() {
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        ui.mainTextArea.setText("HP " + monster.ofTheName + " : " + monster.hp + "\n\nQue faîtes vous ?");
        ui.choice1.setText("Vous attaquez");
        ui.choice2.setText("Vous fuyez");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void playerAttack() {
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int playerDamage = getRandomNumberBetweenTwoBounds(1, player.currentWeapon.damageMax);


        monster.hp = monster.hp - playerDamage;

        ui.mainTextArea.setText("Vous attaquez " + monster.theName + " et lui donnez " + playerDamage + " de dommage!");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monster.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void monsterAttack() {
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int monsterDamage = getRandomNumberBetweenTwoBounds(1, monster.attack);


        player.hp = player.hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.hp);

        ui.mainTextArea.setText(monster.attackMessage + "\n " + monster.theName + " vous attaque et vous donne " + monsterDamage + " de dommage!");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (player.hp > 0) {
            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hp < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void win() {

        ui.getImage(ui.imageLabelPrincipal, "objects/anneau.jpg");
        silverRing = true;
        ui.mainTextArea.setText("Vous avez battu " + monster.theName + " !\n" + monster.theName + " a laché un anneau!\n\n(Vous obtenez un Anneau d'argent)");

        ui.choice1.setText("Vous allez à l'Est");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void lose() {
        ui.getImage(ui.imageLabelPrincipal, "");

        ui.mainTextArea.setText("Vous êtes mort !\n\n GAME OVER");

        ui.choice1.setText("Revenir à l'écran tître");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void ending() {
        ui.getImage(ui.imageLabelPrincipal, "garde.jpg");
        ui.mainTextArea.setText("Garde: \"Oh vous avez tué " + monster.theName + " !!??? Super !\nVous êtes notre heros!\nBienvenue dans notre Cité!\"\n\nTHE END");

        ui.choice1.setText("Revenir à l'écran tître");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPosition1 = "toTitle";
    }

    public void toTitle() {

        defaultSetup();
        vm.showTitleScreen();
    }
}
