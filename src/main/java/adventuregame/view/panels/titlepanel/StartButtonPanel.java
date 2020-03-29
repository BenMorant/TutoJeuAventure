package adventuregame.view.panels.titlepanel;

import adventuregame.view.GamePanel;


public class StartButtonPanel extends GamePanel {

    private StartButton startButton = new StartButton();

    public StartButtonPanel() {
        super(500, 600, 250, 120, null);
        this.add(startButton);
    }

    @Override
    public String toString() {
        return "StartButtonPanel{" +
                "startButton=" + startButton +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
