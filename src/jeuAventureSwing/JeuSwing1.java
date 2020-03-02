package jeuAventureSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JeuSwing1 {

    JFrame window;
    Container container;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.BOLD, 42);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHp;
    int monsterHp;
    boolean silverRing = false;
    String playerWeapon, position;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    public JeuSwing1() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("L'AVENTURE N'ATTEND PAS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("C'EST PARTI !");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        container.add(titleNamePanel);
        container.add(startButtonPanel);
    }

    public static void main(String[] args) {

        new JeuSwing1();
    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea("Yo");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        container.add(choiceButtonPanel);

        choice1 = new JButton("choix 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("choix 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("choix 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("choix 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        container.add(playerPanel);
        hpLabel = new JLabel("PV : ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Arme : ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetup();

    }

    public void playerSetup() {
        playerHp = 15;
        monsterHp = 20;
        playerWeapon = "Couteau";
        weaponLabelName.setText(playerWeapon);
        hpLabelNumber.setText(""+playerHp);

        townGate();
    }

    public void townGate() {
        position = "townGate";
        mainTextArea.setText("Vous êtes à la porte de la Cité. \n Un garde se tient debout devant vous. \n Que voulez vous faire ? \n \n \n ");
        choice1.setText("Parler au garde");
        choice2.setText("Attaquer le garde");
        choice3.setText("Partir de là");
        choice4.setText("");
    }

    public void talkGuard() {
        position = "talkGuard";
        mainTextArea.setText("Garde: \" Bien le bonjour, étranger !\n Je ne vous ai jamais vu. \n Je suis désolé mais nous ne pouvons pas laisser  \n un étranger dans notre ville \"");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Garde: \"Hey ! Ne soyez pas stupide!\" \n Vous vous battez bravement mais le garde vous frappe fort \net vous recevez trois points de dommage");
        playerHp = playerHp - 3;
        hpLabelNumber.setText("" + playerHp);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void crossRoad() {
        position = "crossRoad";
        mainTextArea.setText("Vous êtes à un carrefour. \nSi vous allez au sud, vous serez de retour aux portes de la Cité. \n  Vous choisissez d'aller :");
        choice1.setText("au Nord");
        choice2.setText("à l'Est");
        choice3.setText("au Sud");
        choice4.setText("à l'Ouest");

    }

    public void north() {
        position = "north";
        mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés");
        playerHp = playerHp + 2;
        hpLabelNumber.setText("" + playerHp);
        choice1.setText("Vous allez au Sud");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void east() {
        position = "east";
        mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée.");
        playerWeapon = "Longue épée";
        weaponLabelName.setText(playerWeapon);
        choice1.setText("Vous allez à l'Ouest");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void west() {
        position = "west";
        mainTextArea.setText("Vous tombez nez à nez sur un gobelin ! ");
        choice1.setText("Vous le combattez");
        choice2.setText("Vous fuyez");
        choice3.setText("");
        choice4.setText("");
    }

    public void fight() {
        position = "fight";
        mainTextArea.setText("HP du Monstre : " + monsterHp + "\n\nQue faîtes vous ?");
        choice1.setText("Vous attaquez");
        choice2.setText("Vous fuyez");
        choice3.setText("");
        choice4.setText("");
    }

    public void playerAttack() {
        position = "playerAttack";

        int playerDamage = 0;

        if (playerWeapon.equalsIgnoreCase("couteau")) {
            playerDamage = new java.util.Random().nextInt(3);
        } else if (playerWeapon.equalsIgnoreCase("longue épée")) {
            playerDamage = new java.util.Random().nextInt(12);
        }

        mainTextArea.setText("Vous attaquez le monstre et lui donnez " + playerDamage + " de dommage!");

        monsterHp = monsterHp - playerDamage;

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void monsterAttack() {
        position = "monsterAttack";

        int monsterDamage = 0;

        monsterDamage = new java.util.Random().nextInt(6);

        mainTextArea.setText("Le monstre vous attaque et vous donne " + monsterDamage + " de dommage!");

        playerHp = playerHp - monsterDamage;
        hpLabelNumber.setText("" + playerHp);

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void win() {
        position = "win";

        mainTextArea.setText("Vous avez battu le monstre !\nLe monstre a laché un anneau!\n\n(Vous obtenez un Anneau d'argent)");

        silverRing = true;

        choice1.setText("Vous allez à l'Est");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void lose() {
        position = "lose";

        mainTextArea.setText("Vous êtes mort !\n\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void ending() {
        position = "ending";

        mainTextArea.setText("Garde: \"Oh vous avez tué ce gobelin !!??? Super !\nVous êtes notre heros!\nBienvenue dans notre Cité!\"\n\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public class TitleScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            createGameScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (position) {
                case "townGate":
                    switch (yourChoice) {
                        case "c1":
                            if (silverRing) {
                                ending();
                            } else {
                                talkGuard();
                                break;
                            }
                        case "c2":
                            attackGuard();
                            break;
                        case "c3":
                            crossRoad();
                            break;
                    }
                case "talkGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                    }
                    break;
                case "attackGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                    }
                    break;
                case "crossRoad":
                    switch (yourChoice) {
                        case "c1":
                            north();
                            break;
                        case "c2":
                            east();
                            break;
                        case "c3":
                            townGate();
                            break;
                        case "c4":
                            west();
                            break;
                    }
                    break;
                case "north":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
                case "east":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;
                case "west":
                    switch (yourChoice) {
                        case "c1":
                            fight();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "fight":
                    switch (yourChoice) {
                        case "c1":
                            playerAttack();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;
                case "playerAttack":
                    switch (yourChoice) {
                        case "c1":
                            if (monsterHp < 1) {
                                win();
                            } else {
                                monsterAttack();
                            }
                            break;
                    }
                    break;
                case "monsterAttack":
                    switch (yourChoice) {
                        case "c1":
                            if (playerHp < 1) {
                                lose();
                            } else {
                                fight();
                            }
                            break;
                    }
                    break;
                case "win":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                    }
                    break;

            }


        }
    }


}
