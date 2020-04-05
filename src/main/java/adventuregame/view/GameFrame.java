package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

//    private GamePanel titleNamePanel = new GamePanel(250,250,800,150);
//    private GameLabel titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
//    private GameButton startButton = new GameButton("C'EST PARTI !", "start");
//    private GamePanel startButtonPanel = new GamePanel(500, 600, 250, 120);

    private GamePanel titleNamePanel;
    private GameLabel titleNameLabel;
    private GameButton startButton;
    private GamePanel startButtonPanel;


    private GamePanel mainTextPanel = new GamePanel(40, 650, 750, 550);
    private MainTextArea mainTextArea = new MainTextArea();
    private GamePanel imagePanelMain = new GamePanel(40, 70, 750, 550);
    private ImageLabelMain imageLabelMain = new ImageLabelMain();
    private GamePanel imagePanelHeroPicture = new GamePanel(960, 70, 140, 175);
    private ImageLabelHeroPicture imageLabelHeroPicture = new ImageLabelHeroPicture();
    private ChoiceButtonPanel choiceButtonPanel = new ChoiceButtonPanel();
    private HeroPanel heroPanel = new HeroPanel();

    public GameFrame() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        createTitleScreen();


        mainTextPanel.setBackground(Color.red);
        mainTextPanel.add(mainTextArea);
        imagePanelMain.setBackground(Color.orange);
        imagePanelMain.add(imageLabelMain);
        imagePanelHeroPicture.setBackground(Color.pink);
        imagePanelHeroPicture.add(imageLabelHeroPicture);
        createGameFrame();
    }

    public void createTitleScreen() {
        setVisible(true);
        buildTitleScreen();
    }

    private void buildTitleScreen() {
        Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
        titleNamePanel = new GamePanel(250, 250, 800, 150);
        titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
        startButton = new GameButton("C'EST PARTI !", "start");
        startButtonPanel = new GamePanel(500, 600, 250, 120);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButtonPanel.setBackground(Color.yellow);
    }

    public void createGameFrame() {
        setVisible(true);
        buildGameFrame();
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
