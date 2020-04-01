package adventuregame.view.panels.titlepanel;

import adventuregame.view.GamePanel;
import adventuregame.view.MasterPanel;

public class TitlePanel extends MasterPanel {

    private GamePanel startButtonPanel = new StartButtonPanel();
    private GamePanel titleNamePanel = new TitleNamePanel();

    public TitlePanel() {
        super();
        this.setVisible(true);
        this.add(startButtonPanel);
        this.add(titleNamePanel);
    }




}

