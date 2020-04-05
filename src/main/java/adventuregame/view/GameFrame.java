package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;


    private ChoiceHandler choiceHandler = new ChoiceHandler();


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

        createTitleScreen(choiceHandler);


        mainTextPanel.setBackground(Color.red);
        mainTextPanel.add(mainTextArea);
        imagePanelMain.setBackground(Color.orange);
        imagePanelMain.add(imageLabelMain);
        imagePanelHeroPicture.setBackground(Color.pink);
        imagePanelHeroPicture.add(imageLabelHeroPicture);
        createGameFrame();
    }


    public void createTitleScreen(ChoiceHandler choiceHandler) {
        setVisible(true);
        Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
        titleNamePanel = new GamePanel(250, 250, 800, 150);
        titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
        startButton = new GameButton("C'EST PARTI !", choiceHandler, "start");
        startButtonPanel = new GamePanel(500, 600, 250, 120);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
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

    public static int getDefaultWidth() {
        return DEFAULT_WIDTH;
    }

    public static int getDefaultHeight() {
        return DEFAULT_HEIGHT;
    }

    public GamePanel getTitleNamePanel() {
        return titleNamePanel;
    }

    public void setTitleNamePanel(GamePanel titleNamePanel) {
        this.titleNamePanel = titleNamePanel;
    }

    public GameLabel getTitleNameLabel() {
        return titleNameLabel;
    }

    public void setTitleNameLabel(GameLabel titleNameLabel) {
        this.titleNameLabel = titleNameLabel;
    }

    public GameButton getStartButton() {
        return startButton;
    }

    public void setStartButton(GameButton startButton) {
        this.startButton = startButton;
    }

    public GamePanel getStartButtonPanel() {
        return startButtonPanel;
    }

    public void setStartButtonPanel(GamePanel startButtonPanel) {
        this.startButtonPanel = startButtonPanel;
    }

    public GamePanel getMainTextPanel() {
        return mainTextPanel;
    }

    public void setMainTextPanel(GamePanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }

    public MainTextArea getMainTextArea() {
        return mainTextArea;
    }

    public void setMainTextArea(MainTextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    public GamePanel getImagePanelMain() {
        return imagePanelMain;
    }

    public void setImagePanelMain(GamePanel imagePanelMain) {
        this.imagePanelMain = imagePanelMain;
    }

    public ImageLabelMain getImageLabelMain() {
        return imageLabelMain;
    }

    public void setImageLabelMain(ImageLabelMain imageLabelMain) {
        this.imageLabelMain = imageLabelMain;
    }

    public GamePanel getImagePanelHeroPicture() {
        return imagePanelHeroPicture;
    }

    public void setImagePanelHeroPicture(GamePanel imagePanelHeroPicture) {
        this.imagePanelHeroPicture = imagePanelHeroPicture;
    }

    public ImageLabelHeroPicture getImageLabelHeroPicture() {
        return imageLabelHeroPicture;
    }

    public void setImageLabelHeroPicture(ImageLabelHeroPicture imageLabelHeroPicture) {
        this.imageLabelHeroPicture = imageLabelHeroPicture;
    }

    public ChoiceButtonPanel getChoiceButtonPanel() {
        return choiceButtonPanel;
    }

    public void setChoiceButtonPanel(ChoiceButtonPanel choiceButtonPanel) {
        this.choiceButtonPanel = choiceButtonPanel;
    }

    public HeroPanel getHeroPanel() {
        return heroPanel;
    }

    public void setHeroPanel(HeroPanel heroPanel) {
        this.heroPanel = heroPanel;
    }
}
