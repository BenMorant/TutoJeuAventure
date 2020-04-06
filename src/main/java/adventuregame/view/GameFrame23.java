package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameFrame23 extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    private GamePanel titleNamePanel;
    private GameLabel titleNameLabel;
    private GameButton startButton;
    private GamePanel startButtonPanel;


    private GamePanel mainTextPanel = new GamePanel(40, 650, 750, 550);
    private GameTextArea mainTextArea = new GameTextArea("yo", 40, 650, 750, 350);
    private GamePanel imagePanelMain = new GamePanel(40, 70, 750, 550);
    private GameImageLabel imageLabelMain = new GameImageLabel();
    private GamePanel imagePanelHeroPicture = new GamePanel(960, 70, 140, 175);
    private GameImageLabel imageLabelHeroPicture = new GameImageLabel();
    private GamePanel choiceButtonPanel = new GamePanel(850, 650, 400, 200);
    private GameButton choice1 = new GameButton("choix 1", "c1");
    private GameButton choice2 = new GameButton("choix 2", "c2");
    private GameButton choice3 = new GameButton("choix 3", "c3");
    private GameButton choice4 = new GameButton("choix 4", "c4");
    private GamePanel heroPanel = new GamePanel(850, 260, 400, 320);

    private Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);

    private GameLabel hpLabel = new GameLabel("HP : ", Color.white, heroPanelFont);
    private GameLabel hpLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel hpMaxLabel = new GameLabel("HP Max : ", Color.yellow, heroPanelFont);
    private GameLabel hpMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel weaponLabel = new GameLabel("Arme : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelName = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel weaponLabelDamageMax = new GameLabel("Domage Max : ", Color.orange, heroPanelFont);
    private GameLabel weaponLabelDamageMaxNumber = new GameLabel("", Color.orange, heroPanelFont);
    private GameLabel abilityLabel = new GameLabel("Habileté : ", Color.white, heroPanelFont);
    private GameLabel strengthLabel = new GameLabel("Force : ", Color.white, heroPanelFont);
    private GameLabel mpLabel = new GameLabel("MP : ", Color.lightGray, heroPanelFont);
    private GameLabel mpLabelNumber = new GameLabel("", Color.lightGray, heroPanelFont);
    private GameLabel mpMaxLabel = new GameLabel("MP Max: ", Color.darkGray, heroPanelFont);
    private GameLabel mpMaxLabelNumber = new GameLabel("", Color.darkGray, heroPanelFont);
    private GameLabel strengthLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel abilityLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel strengthMaxLabel = new GameLabel("Force Max : ", Color.yellow, heroPanelFont);
    private GameLabel strengthMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel abilityMaxLabel = new GameLabel("Habileté Max: ", Color.yellow, heroPanelFont);
    private GameLabel abilityMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel weaponLabelWear = new GameLabel("Usure : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearMaxLabel = new GameLabel("Usure Max : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearMaxLabelNumber = new GameLabel("", Color.white, heroPanelFont);

    public GameFrame23() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        createTitleScreen();

        mainTextPanel.add(mainTextArea);
        imagePanelMain.add(imageLabelMain);
        imagePanelHeroPicture.add(imageLabelHeroPicture);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        choiceButtonPanel.add(choice1);
        choiceButtonPanel.add(choice2);
        choiceButtonPanel.add(choice3);
        choiceButtonPanel.add(choice4);

        heroPanel.setLayout(new GridLayout(12, 2));
        heroPanel.add(hpLabel);
        heroPanel.add(hpLabelNumber);
        heroPanel.add(hpMaxLabel);
        heroPanel.add(hpMaxLabelNumber);
        heroPanel.add(mpLabel);
        heroPanel.add(mpLabelNumber);
        heroPanel.add(mpMaxLabel);
        heroPanel.add(mpMaxLabelNumber);
        heroPanel.add(weaponLabel);
        heroPanel.add(weaponLabelName);
        heroPanel.add(weaponLabelDamageMax);
        heroPanel.add(weaponLabelDamageMaxNumber);
        heroPanel.add(weaponLabelWear);
        heroPanel.add(weaponLabelWearNumber);
        heroPanel.add(weaponLabelWearMaxLabel);
        heroPanel.add(weaponLabelWearMaxLabelNumber);
        heroPanel.add(strengthLabel);
        heroPanel.add(strengthLabelNumber);
        heroPanel.add(strengthMaxLabel);
        heroPanel.add(strengthMaxLabelNumber);
        heroPanel.add(abilityLabel);
        heroPanel.add(abilityLabelNumber);
        heroPanel.add(abilityMaxLabel);
        heroPanel.add(abilityMaxLabelNumber);

        createGameFrame();
    }

    public void createTitleScreen() {
        setVisible(true);
        BuildTitleScreen();
    }

    public void createGameFrame() {
        setVisible(true);
        buildGameFrame();
    }

    private void BuildTitleScreen() {

        Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
        titleNamePanel = new GamePanel(250, 250, 800, 150);
        titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
        startButton = new GameButton("C'EST PARTI !", "start");
        startButtonPanel = new GamePanel(500, 600, 250, 120);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
    }

    private void buildGameFrame() {
        add(titleNamePanel);
        add(startButtonPanel);
        add(mainTextPanel);
        add(imagePanelMain);
        add(imagePanelHeroPicture);
        add(choiceButtonPanel);
        add(heroPanel);
        pack();
    }
}
