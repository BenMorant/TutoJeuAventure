package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    public GamePanel() {
        super();
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }
}
