package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public abstract class MasterPanel extends JPanel {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;


    public MasterPanel() {
        super();
        setVisible(true);
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    @Override
    public String toString() {
        return "MasterPanel{}";
    }
}
