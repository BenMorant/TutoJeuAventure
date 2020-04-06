package adventuregame.view;

import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;

public class TitlePanel extends MasterPanel {

    private Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
    private GamePanel titleNamePanel = new GamePanel(250, 250, 800, 150);
    private GameLabel titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
    private GameButton startButton = new GameButton("C'EST PARTI !", "start");
    private GamePanel startButtonPanel = new GamePanel(500, 600, 250, 120);

    public TitlePanel() {
        super();
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        add(titleNamePanel);
        add(startButtonPanel);
    }

}
