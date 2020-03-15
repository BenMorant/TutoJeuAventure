package JeuAventureSwing.gameMechanix;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanelPrincipal, imagePanelPortrait;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, hpMaxLabel, hpMaxLabelNumber, weaponLabel, weaponLabelName, weaponLabelDamageMax, weaponLabelDamageMaxNumber, imageLabelPrincipal, imageLabelPortrait,
            habilityLabel, strengthLabel, mpLabel, mpLabelNumber, mpMaxLabel, mpMaxLabelNumber, strengthLabelNumber, habilityLabelNumber, strengthMaxLabel, strengthMaxLabelNumber, habilityMaxLabel, habilityMaxLabelNumber;
    Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
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
        playerPanel.setLayout(new GridLayout(10, 2));
        window.add(playerPanel);
        hpLabel = new JLabel("HP : ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        hpMaxLabel = new JLabel("HP max : ");
        hpMaxLabel.setFont(normalFont);
        hpMaxLabel.setForeground(Color.yellow);
        playerPanel.add(hpMaxLabel);
        hpMaxLabelNumber = new JLabel();
        hpMaxLabelNumber.setFont(normalFont);
        hpMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(hpMaxLabelNumber);
        mpLabel = new JLabel("MP : ");
        mpLabel.setFont(normalFont);
        mpLabel.setForeground(Color.lightGray);
        playerPanel.add(mpLabel);
        mpLabelNumber = new JLabel();
        mpLabelNumber.setFont(normalFont);
        mpLabelNumber.setForeground(Color.lightGray);
        playerPanel.add(mpLabelNumber);
        mpMaxLabel = new JLabel("MP max : ");
        mpMaxLabel.setFont(normalFont);
        mpMaxLabel.setForeground(Color.darkGray);
        playerPanel.add(mpMaxLabel);
        mpMaxLabelNumber = new JLabel();
        mpMaxLabelNumber.setFont(normalFont);
        mpMaxLabelNumber.setForeground(Color.darkGray);
        playerPanel.add(mpMaxLabelNumber);
        weaponLabel = new JLabel("Arme : ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);
        weaponLabelDamageMax = new JLabel("Dommage Max : ");
        weaponLabelDamageMax.setFont(normalFont);
        weaponLabelDamageMax.setForeground(Color.orange);
        playerPanel.add(weaponLabelDamageMax);
        weaponLabelDamageMaxNumber = new JLabel();
        weaponLabelDamageMaxNumber.setFont(normalFont);
        weaponLabelDamageMaxNumber.setForeground(Color.orange);
        playerPanel.add(weaponLabelDamageMaxNumber);
        strengthLabel = new JLabel("Force : ");
        strengthLabel.setFont(normalFont);
        strengthLabel.setForeground(Color.white);
        playerPanel.add(strengthLabel);
        strengthLabelNumber = new JLabel();
        strengthLabelNumber.setFont(normalFont);
        strengthLabelNumber.setForeground(Color.white);
        playerPanel.add(strengthLabelNumber);
        strengthMaxLabel = new JLabel("Force Max: ");
        strengthMaxLabel.setFont(normalFont);
        strengthMaxLabel.setForeground(Color.yellow);
        playerPanel.add(strengthMaxLabel);
        strengthMaxLabelNumber = new JLabel();
        strengthMaxLabelNumber.setFont(normalFont);
        strengthMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(strengthMaxLabelNumber);
        habilityLabel = new JLabel("Habileté : ");
        habilityLabel.setFont(normalFont);
        habilityLabel.setForeground(Color.white);
        playerPanel.add(habilityLabel);
        habilityLabelNumber = new JLabel();
        habilityLabelNumber.setFont(normalFont);
        habilityLabelNumber.setForeground(Color.white);
        playerPanel.add(habilityLabelNumber);
        habilityMaxLabel = new JLabel("Habileté Max: ");
        habilityMaxLabel.setFont(normalFont);
        habilityMaxLabel.setForeground(Color.yellow);
        playerPanel.add(habilityMaxLabel);
        habilityMaxLabelNumber = new JLabel();
        habilityMaxLabelNumber.setFont(normalFont);
        habilityMaxLabelNumber.setForeground(Color.yellow);
        playerPanel.add(habilityMaxLabelNumber);

        window.setVisible(true);

    }

    public void getImage(JLabel imageLabelToDefine, String filename) {
        image = new ImageIcon(".//resources//" + filename);
        imageLabelToDefine.setIcon(image);
    }
}
