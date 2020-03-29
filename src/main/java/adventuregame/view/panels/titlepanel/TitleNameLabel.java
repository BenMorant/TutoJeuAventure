package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameLabel;

import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;

public class TitleNameLabel extends GameLabel {

    public TitleNameLabel() {
        super(TITLE, new Font("Times New Roman", Font.BOLD, 52), Color.white);
    }

    @Override
    public String toString() {
        return "TitleNameLabel{" +
                "labelFor=" + labelFor +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
