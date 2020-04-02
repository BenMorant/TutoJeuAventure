package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameLabel;
import adventuregame.view.GamePanel;

public class TitleNamePanel extends GamePanel {

    private GameLabel titleNameLabel;

    public TitleNamePanel() {
        super(250, 250, 800, 150, null);
        this.setVisible(true);
        titleNameLabel = new TitleNameLabel();
        this.add(titleNameLabel);
    }
}

