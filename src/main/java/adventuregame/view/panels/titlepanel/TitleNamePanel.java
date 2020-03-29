package adventuregame.view.panels.titlepanel;

import adventuregame.view.GamePanel;

public class TitleNamePanel extends GamePanel {

    private TitleNameLabel titleNameLabel = new TitleNameLabel();

    public TitleNamePanel() {
        super(250, 250, 800, 150, null);
        this.add(titleNameLabel);
    }

    @Override
    public String toString() {
        return "TitleNamePanel{" +
                "titleNameLabel=" + titleNameLabel +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}

