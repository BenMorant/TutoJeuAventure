package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;


    private TitleNamePanel titleNamePanel = new TitleNamePanel();
    private StartButtonPanel startButtonPanel = new StartButtonPanel();
    private MainTextPanel mainTextPanel = new MainTextPanel();
    private ImagePanelMain imagePanelMain = new ImagePanelMain();
    private ImagePanelHeroPicture imagePanelHeroPicture = new ImagePanelHeroPicture();
    private ChoiceButtonPanel choiceButtonPanel = new ChoiceButtonPanel();
    private HeroPanel heroPanel = new HeroPanel();

    public GameFrame() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        createGameFrame();
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
