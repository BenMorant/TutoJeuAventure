package adventuregame.gamemechanix;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanelPrincipal, imagePanelPortrait;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, hpMaxLabel, hpMaxLabelNumber, weaponLabel, weaponLabelName, weaponLabelDamageMax, weaponLabelDamageMaxNumber, imageLabelPrincipal, imageLabelPortrait,
            abilityLabel, strengthLabel, mpLabel, mpLabelNumber, mpMaxLabel, mpMaxLabelNumber, strengthLabelNumber, abilityLabelNumber, strengthMaxLabel, strengthMaxLabelNumber, abilityMaxLabel, abilityMaxLabelNumber,
            weaponLabelWear, weaponLabelWearNumber, weaponLabelWearMaxLabel, weaponLabelWearMaxLabelNumber;
    Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    Font playerPanelFont = new Font("Times New Roman", Font.PLAIN, 22);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    ImageIcon image;

    public void createUI(Game.ChoiceHandler choiceHandler) {

        //fenêtre
        window = new JFrame();
        window.setSize(1280, 960);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        //écran tître
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(250, 250, 800, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("L'AVENTURE N'ATTEND PAS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(500, 600, 250, 120);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("C'EST PARTI !");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //image Principale
        imagePanelPrincipal = new JPanel();
        imagePanelPrincipal.setBounds(40, 70, 750, 550);
        imagePanelPrincipal.setBackground(Color.black);
        imageLabelPrincipal = new JLabel("");
        imagePanelPrincipal.add(imageLabelPrincipal);
        window.add(imagePanelPrincipal);

        //portrait du personnage
        imagePanelPortrait = new JPanel();
        imagePanelPortrait.setBounds(960, 70, 140, 175);
        imagePanelPortrait.setBackground(Color.black);
        imageLabelPortrait = new JLabel("");
        imagePanelPortrait.add(imageLabelPortrait);
        window.add(imagePanelPortrait);

        //écran jeu
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(40, 650, 750, 550);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Yo");
        mainTextArea.setBounds(40, 650, 750, 350);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(850, 650, 400, 200);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(choiceButtonPanel);

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
        playerPanel.setBounds(850, 260, 400, 320);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(12, 2));
        window.add(playerPanel);
        hpLabel = new JLabel("HP : ");
        hpLabel.setFont(playerPanelFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(playerPanelFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        hpMaxLabel = new JLabel("HP max : ");
        hpMaxLabel.setFont(playerPanelFont);
        hpMaxLabel.setForeground(Color.yellow);
        playerPanel.add(hpMaxLabel);
        hpMaxLabelNumber = new JLabel();
        hpMaxLabelNumber.setFont(playerPanelFont);
        hpMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(hpMaxLabelNumber);
        mpLabel = new JLabel("MP : ");
        mpLabel.setFont(playerPanelFont);
        mpLabel.setForeground(Color.lightGray);
        playerPanel.add(mpLabel);
        mpLabelNumber = new JLabel();
        mpLabelNumber.setFont(playerPanelFont);
        mpLabelNumber.setForeground(Color.lightGray);
        playerPanel.add(mpLabelNumber);
        mpMaxLabel = new JLabel("MP max : ");
        mpMaxLabel.setFont(playerPanelFont);
        mpMaxLabel.setForeground(Color.darkGray);
        playerPanel.add(mpMaxLabel);
        mpMaxLabelNumber = new JLabel();
        mpMaxLabelNumber.setFont(playerPanelFont);
        mpMaxLabelNumber.setForeground(Color.darkGray);
        playerPanel.add(mpMaxLabelNumber);
        weaponLabel = new JLabel("Arme : ");
        weaponLabel.setFont(playerPanelFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(playerPanelFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);
        weaponLabelDamageMax = new JLabel("Dommage Max : ");
        weaponLabelDamageMax.setFont(playerPanelFont);
        weaponLabelDamageMax.setForeground(Color.orange);
        playerPanel.add(weaponLabelDamageMax);
        weaponLabelDamageMaxNumber = new JLabel();
        weaponLabelDamageMaxNumber.setFont(playerPanelFont);
        weaponLabelDamageMaxNumber.setForeground(Color.orange);
        playerPanel.add(weaponLabelDamageMaxNumber);
        weaponLabelWear = new JLabel("Usure : ");
        weaponLabelWear.setFont(playerPanelFont);
        weaponLabelWear.setForeground(Color.white);
        playerPanel.add(weaponLabelWear);
        weaponLabelWearNumber = new JLabel();
        weaponLabelWearNumber.setFont(playerPanelFont);
        weaponLabelWearNumber.setForeground(Color.white);
        playerPanel.add(weaponLabelWearNumber);
        weaponLabelWearMaxLabel = new JLabel("Usure max : ");
        weaponLabelWearMaxLabel.setFont(playerPanelFont);
        weaponLabelWearMaxLabel.setForeground(Color.white);
        playerPanel.add(weaponLabelWearMaxLabel);
        weaponLabelWearMaxLabelNumber = new JLabel();
        weaponLabelWearMaxLabelNumber.setFont(playerPanelFont);
        weaponLabelWearMaxLabelNumber.setForeground(Color.white);
        playerPanel.add(weaponLabelWearMaxLabelNumber);
        strengthLabel = new JLabel("Force : ");
        strengthLabel.setFont(playerPanelFont);
        strengthLabel.setForeground(Color.white);
        playerPanel.add(strengthLabel);
        strengthLabelNumber = new JLabel();
        strengthLabelNumber.setFont(playerPanelFont);
        strengthLabelNumber.setForeground(Color.white);
        playerPanel.add(strengthLabelNumber);
        strengthMaxLabel = new JLabel("Force Max: ");
        strengthMaxLabel.setFont(playerPanelFont);
        strengthMaxLabel.setForeground(Color.yellow);
        playerPanel.add(strengthMaxLabel);
        strengthMaxLabelNumber = new JLabel();
        strengthMaxLabelNumber.setFont(playerPanelFont);
        strengthMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(strengthMaxLabelNumber);
        abilityLabel = new JLabel("Habileté : ");
        abilityLabel.setFont(playerPanelFont);
        abilityLabel.setForeground(Color.white);
        playerPanel.add(abilityLabel);
        abilityLabelNumber = new JLabel();
        abilityLabelNumber.setFont(playerPanelFont);
        abilityLabelNumber.setForeground(Color.white);
        playerPanel.add(abilityLabelNumber);
        abilityMaxLabel = new JLabel("Habileté Max: ");
        abilityMaxLabel.setFont(playerPanelFont);
        abilityMaxLabel.setForeground(Color.yellow);
        playerPanel.add(abilityMaxLabel);
        abilityMaxLabelNumber = new JLabel();
        abilityMaxLabelNumber.setFont(playerPanelFont);
        abilityMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(abilityMaxLabelNumber);

        window.setVisible(true);

    }

    public void getImage(JLabel imageLabelToDefine, String filename) {
        image = new ImageIcon(".//src//main//resources//pix//" + filename);
        imageLabelToDefine.setIcon(image);
    }
}
