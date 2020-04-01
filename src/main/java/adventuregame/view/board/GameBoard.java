package adventuregame.view.board;

import adventuregame.view.MasterPanel;

import javax.swing.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameBoard extends JFrame {

    private MasterPanel masterPanel;

    public GameBoard() {
        super(TITLE);
        masterPanel = new MasterPanel();


        start();

    }

    public void start() {
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {
        this.add(masterPanel);

        pack();
    }
}
