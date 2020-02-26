package jeuAventureSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JeuSwing1 {

    JFrame window;
    Container container;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 42);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHp;
    String playerWeapon;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

    public static void main(String[] args) {

        new JeuSwing1();
    }

    public JeuSwing1() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.darkGray);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.gray);
        titleNameLabel = new JLabel("L'AVENTURE N'ATTEND PAS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("C'EST PARTI !");
        startButton.setBackground(Color.lightGray);
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
       // startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        container.add(titleNamePanel);
        container.add(startButtonPanel);
    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.darkGray);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea("Yo");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 350, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        container.add(choiceButtonPanel);

        choice1 = new JButton("choix 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("choix 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("choix 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("choix 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
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
        playerWeapon = "Couteau";
        weaponLabelName.setText(playerWeapon);
        hpLabelNumber.setText(""+playerHp);
    }

    public class TitleScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            createGameScreen();

        }
    }
}
