package JeuAventureSwingClassesMultiples.package01;

import JeuAventureSwingClassesMultiples.package02.WeaponKnife;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();

    public Story(Game g, UI userInterface, VisibilityManager vManager) {

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {

        player.hp = 10;
        ui.hpLabelNumber.setText("" + player.hp);

        player.currentWeapon = new WeaponKnife();
        ui.weaponLabelName.setText((player.currentWeapon.name));
    }

    public void selectNextPosition(String nextPosition) {

    }

    public void townGate() {

        ui.mainTextArea.setText("Vous êtes à la porte de la Cité. \n Un garde se tient debout devant vous. \n Que voulez vous faire ? \n \n \n ");
        ui.choice1.setText("Parler au garde");
        ui.choice2.setText("Attaquer le garde");
        ui.choice3.setText("Partir de là");
        ui.choice4.setText("");

        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.getNextPosition3 = "crossroad";
    }

    public void talkGuard() {
        //position = "talkGuard";
        ui.mainTextArea.setText("Garde: \" Bien le bonjour, étranger !\n Je ne vous ai jamais vu. \n Je suis désolé mais nous ne pouvons pas laisser  \n un étranger dans notre ville \"");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
    }

    public void attackGuard() {
        //position = "attackGuard";
        ui.mainTextArea.setText("Garde: \"Hey ! Ne soyez pas stupide!\" \n Vous vous battez bravement mais le garde vous frappe fort \net vous recevez trois points de dommage");
        //ui.playerHp = playerHp - 3;
        //ui.hpLabelNumber.setText("" + playerHp);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
    }

    public void crossRoad() {
        //position = "crossRoad";
        ui.mainTextArea.setText("Vous êtes à un carrefour. \nSi vous allez au sud, vous serez de retour aux portes de la Cité. \n  Vous choisissez d'aller :");
        ui.choice1.setText("au Nord");
        ui.choice2.setText("à l'Est");
        ui.choice3.setText("au Sud");
        ui.choice4.setText("à l'Ouest");

    }

    public void north() {
        //position = "north";
        ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés");
        //playerHp = playerHp + 2;
        //hpLabelNumber.setText("" + playerHp);
        ui.choice1.setText("Vous allez au Sud");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
    }

    public void east() {
        //position = "east";
        ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée.");
        // playerWeapon = "Longue épée";
        //weaponLabelName.setText(playerWeapon);
        ui.choice1.setText("Vous allez à l'Ouest");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

    }

    public void west() {
        // position = "west";
        ui.mainTextArea.setText("Vous tombez nez à nez sur un gobelin ! ");
        ui.choice1.setText("Vous le combattez");
        ui.choice2.setText("Vous fuyez");
        ui.choice3.setText("");
        ui.choice4.setText("");
    }

    public void fight() {
        // position = "fight";
        //    ui.mainTextArea.setText("HP du Monstre : " + monsterHp + "\n\nQue faîtes vous ?");
        ui.choice1.setText("Vous attaquez");
        ui.choice2.setText("Vous fuyez");
        ui.choice3.setText("");
        ui.choice4.setText("");
    }
}
