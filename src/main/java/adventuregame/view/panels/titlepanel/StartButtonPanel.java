package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameButton;
import adventuregame.view.GamePanel;

import javax.swing.*;

public class StartButtonPanel extends GamePanel {

    private JButton startButton = new GameButton("C'est Parti !", "start");

    public StartButtonPanel() {
        super(500, 600, 250, 120, null);
        this.setVisible(true);
        this.add(startButton);
    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }
}
