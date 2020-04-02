package adventuregame.view.panels.titlepanel;

import adventuregame.view.GamePanel;

public class StartButtonPanel extends GamePanel {

    public StartButtonPanel() {
        super(500, 600, 250, 120, null);
    }

    @Override
    public String toString() {
        return "StartButtonPanel{" +
                "ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
