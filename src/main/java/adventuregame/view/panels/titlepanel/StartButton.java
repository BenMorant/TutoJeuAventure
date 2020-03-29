package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameButton;

public class StartButton extends GameButton {

    public StartButton() {
        super("C'est Parti !", "start");
    }

    @Override
    public String toString() {
        return "StartButton{" +
                "model=" + model +
                ", changeListener=" + changeListener +
                ", actionListener=" + actionListener +
                ", itemListener=" + itemListener +
                ", changeEvent=" + changeEvent +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
