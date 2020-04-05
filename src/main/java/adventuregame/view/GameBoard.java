package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;


    private TitleNamePanel titleNamePanel;
    private StartButtonPanel startButtonPanel;
    private MainTextPanel mainTextPanel;
    private ImagePanelMain imagePanelMain;
    private ImagePanelHeroPicture imagePanelHeroPicture;
    private ChoiceButtonPanel choiceButtonPanel;
    private HeroPanel heroPanel;

    public GameBoard() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();
        mainTextPanel = new MainTextPanel();
        imagePanelMain = new ImagePanelMain();
        imagePanelHeroPicture = new ImagePanelHeroPicture();
        choiceButtonPanel = new ChoiceButtonPanel();
        heroPanel = new HeroPanel();
        //       start();
        buildGameBoard();

    }

//    public void start() {
//        setVisible(true);
//        buildGameBoard();
//    }

    private void buildGameBoard() {
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
