package adventuregame.view.panels.titlepanel;

import adventuregame.view.MasterPanel;

public class TitlePanel extends MasterPanel {

    private StartButtonPanel startButtonPanel = new StartButtonPanel();
    private TitleNamePanel titleNamePanel = new TitleNamePanel();

    public TitlePanel() {
        System.out.println("je suis dans le constructeur de TitlePanel");
        this.add(startButtonPanel);
        this.add(titleNamePanel);
    }

    @Override
    public String toString() {
        return "TitlePanel{" +
                "startButtonPanel=" + startButtonPanel +
                ", titleNamePanel=" + titleNamePanel +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}

