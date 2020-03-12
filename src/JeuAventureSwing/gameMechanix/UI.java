package JeuAventureSwing.gameMechanix;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, imagePanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, hpMaxLabel, hpMaxLabelNumber, weaponLabel, weaponLabelName, weaponLabelDamageMax, weaponLabelDamageMaxNumber, imageLabel;
    Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
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

        //image
        imagePanel = new JPanel();
        imagePanel.setBounds(50, 60, 700, 500);
        imagePanel.setBackground(Color.black);

        imageLabel = new JLabel("");
        imagePanel.add(imageLabel);
        window.add(imagePanel);

        //écran jeu
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50, 650, 550, 350);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Yo");
        mainTextArea.setBounds(50, 650, 550, 350);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(800, 650, 350, 200);
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
        playerPanel.setBounds(850, 120, 450, 120);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(4, 2));
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

        window.setVisible(true);

    }

    public void getImage(String filename) {
        image = new ImageIcon(".//resources//" + filename);
        imageLabel.setIcon(image);
    }
}
