package adventuregame.view;

import javax.swing.*;

//@SuppressWarnings("serial")
public class GameBoard extends JFrame {

    private GamePanel gamePanel;

    public GameBoard() {
        super("L'Aventure n'attend pas");
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
