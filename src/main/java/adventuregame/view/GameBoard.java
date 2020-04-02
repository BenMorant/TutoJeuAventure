package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    private JPanel titleNamePanel = new GamePanel(250, 250, 800, 150, null);
    private JPanel startButtonPanel = new GamePanel(500, 600, 250, 120, null);
    private JPanel mainTextPanel = new GamePanel(40, 650, 750, 550, null);
    private JPanel imagePanelMain = new GamePanel(40, 70, 750, 550, null);
    private JPanel imagePanelHeroPicture = new GamePanel(960, 70, 140, 175, null);
    private JPanel choiceButtonPanel = new GamePanel(850, 650, 400, 200, new GridLayout(4, 1));
    private JPanel heroPanel = new GamePanel(850, 260, 400, 320, new GridLayout(12, 2));


    public GameBoard() {
        super(TITLE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        start();

    }

    public void start() {

        buildGUI();
        setVisible(true);
    }

    private void buildGUI() {

        this.add(titleNamePanel);
//this.add(startButtonPanel);
//this.add(mainTextPanel);
//this.add(imagePanelMain);
//this.add(imagePanelHeroPicture);
//this.add(choiceButtonPanel);
//this.add(heroPanel);

    }
}
