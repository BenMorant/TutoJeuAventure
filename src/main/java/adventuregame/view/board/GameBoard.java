package adventuregame.view.board;

import adventuregame.view.panels.titlepanel.TitleNamePanel;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    private TitleNamePanel titleNamePanel;

    public GameBoard() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
//titleNamePanel = new TitleNamePanel();
        start();

    }

    public void start() {
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {

//this.add(titleNamePanel);
        pack();
    }
}
