package adventuregame.view;

import javax.swing.*;

import static adventuregame.model.uielements.Board.TITLE;


public class GameFrame extends JFrame {

    private TitlePanel titlePanel;
    private MainPanel mainPanel;


    public GameFrame() {
        super(TITLE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        titlePanel = new TitlePanel();
        mainPanel = new MainPanel();
        setContentPane(titlePanel);
        // setContentPane(mainPanel);
        setVisible(true);
        pack();
        //   createGameFrame();
    }


    public void createGameFrame() {

        buildGameFrame();
    }

    private void buildGameFrame() {
        // add(titlePanel);
        // add(mainPanel);

    }


}
