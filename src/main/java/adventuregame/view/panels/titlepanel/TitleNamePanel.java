package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameLabel;
import adventuregame.view.GamePanel;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;

public class TitleNamePanel extends GamePanel {

    private JLabel titleNameLabel = new GameLabel(TITLE, new Font("Times New Roman", Font.BOLD, 52), Color.white);

    public TitleNamePanel() {
        super(250, 250, 800, 150, null);
        this.setVisible(true);
        this.add(titleNameLabel);
    }

    public JLabel getTitleNameLabel() {
        return titleNameLabel;
    }

    public void setTitleNameLabel(JLabel titleNameLabel) {
        this.titleNameLabel = titleNameLabel;
    }
}

