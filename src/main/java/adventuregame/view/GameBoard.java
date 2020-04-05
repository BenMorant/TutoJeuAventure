package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

//private GamePanel gamePanel;

    private TitleNamePanel titleNamePanel;

//    private JPanel titleNamePanel;
//    private JLabel titleNameLabel;
//    private GamePanel startButtonPanel = new StartButtonPanel(500, 600, 250, 120, null);
//    private GamePanel mainTextPanel = new MainTextPanel(40, 650, 750, 550, null);
//    private GamePanel imagePanelMain = new ImagePanel(40, 70, 750, 550, null);
//    private GamePanel imagePanelHeroPicture = new ImagePanel(960, 70, 140, 175, null);
//    private GamePanel choiceButtonPanel = new ChoiceButtonPanel(850, 650, 400, 200, new GridLayout(4, 1));
//    private GamePanel heroPanel = new HeroPanel(850, 260, 400, 320, new GridLayout(12, 2));


    public GameBoard() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
//     titleNamePanel = new GamePanel(null,250, 250, 800, 150);
//     titleNamePanel.setBackground(Color.yellow);
//                titleNameLabel = new JLabel("L'AVENTURE N'ATTEND PAS");
//        titleNameLabel.setForeground(Color.white);
//        titleNamePanel.add(titleNameLabel);
//gamePanel = new GamePanel();
        titleNamePanel = new TitleNamePanel();
        start();

    }

    public void start() {
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {
        add(titleNamePanel);
        //  JPanel masterPanel = new JPanel();
        //  masterPanel.add(gamePanel);
        // add(masterPanel);
//        add(gamePanel);
        pack();
//this.add(titleNamePanel);
//        System.out.println(titleNamePanel.toString());
//this.add(startButtonPanel);
//this.add(mainTextPanel);
//this.add(imagePanelMain);
//this.add(imagePanelHeroPicture);
//this.add(choiceButtonPanel);
//this.add(heroPanel);

    }
}
