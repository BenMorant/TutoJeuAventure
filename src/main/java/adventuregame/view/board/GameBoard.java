package adventuregame.view.board;

import adventuregame.view.MasterPanel;
import adventuregame.view.panels.mainpanel.MainPanel;
import adventuregame.view.panels.titlepanel.TitlePanel;

import javax.swing.*;

import static adventuregame.model.uielements.Board.TITLE;

//@SuppressWarnings("serial")
public class GameBoard extends JFrame {

    private MasterPanel titlePanel;
    private MasterPanel mainPanel;


    public GameBoard() {
        super(TITLE);
        titlePanel = new TitlePanel();
        mainPanel = new MainPanel();
        start();

    }

    public void start() {
        System.out.println("je suis dans start");
        setVisible(true);
        buildGUI();
    }

    private void buildGUI() {
        System.out.println("je suis dans buildGUI");
        add(titlePanel);
        add(mainPanel);
//        add(titleNamePanel);
//        add(startButtonPanel);
//        add(mainTextPanel);
//        add(imagePanelMain);
//        add(imagePanelHeroPicture);
//        add(choiceButtonPanel);
//        add(heroPanel);

        pack();
    }
}
