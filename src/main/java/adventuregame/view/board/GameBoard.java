package adventuregame.view.board;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    public GameBoard() {
        super(TITLE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
        start();

    }

    public void start() {
        System.out.println("je suis là LOL! ");
        buildUI();
    }

    private void buildUI() {
//        add(titleNamePanel);
//        add(startButtonPanel);
//        add(mainTextPanel);
//        add(imagePanelMain);
//        add(imagePanelHeroPicture);
//        add(choiceButtonPanel);
//        add(heroPanel);
        System.out.println("je suis ici");

    }
}
