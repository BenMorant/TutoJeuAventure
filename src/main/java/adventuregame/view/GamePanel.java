package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 600;

    public GamePanel() {
        super();
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }
}
