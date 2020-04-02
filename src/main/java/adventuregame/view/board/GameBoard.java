package adventuregame.view.board;

import adventuregame.view.panels.titlepanel.StartButtonPanel;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;


    private StartButtonPanel startButtonPanel;

    public GameBoard() {
        super(TITLE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);


// startButtonPanel = new StartButtonPanel();
// startButtonPanel.setBackground(Color.white);
//     System.out.println(startButtonPanel.getBounds());


        start();

    }

    public void start() {
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {

        //  this.add(startButtonPanel);
        pack();
    }
}
