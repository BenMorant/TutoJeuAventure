package adventuregame.view;

import javax.swing.*;

import static adventuregame.model.uielements.Board.TITLE;

//@SuppressWarnings("serial")
public class GameBoard extends JFrame {

    private GamePanel gamePanel;

    public GameBoard() {
        super(TITLE);
        gamePanel = new GamePanel();
        start();

    }

    public void start() {
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {
//        JPanel masterPanel = new JPanel();
//        masterPanel.add(gamePanel);
        //   add(masterPanel);
        add(gamePanel);
        pack();
    }
}
