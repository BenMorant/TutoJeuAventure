package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public abstract class MasterPanel extends JPanel {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 960;

    public MasterPanel() {

        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setBackground(Color.black);
        setLayout(null);


    }
}
