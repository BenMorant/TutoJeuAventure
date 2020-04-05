package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int x;
    private int y;
    private int width;
    private int height;

    public GamePanel(int x, int y, int width, int height) {
        super();
        setBounds(x, y, width, height);
        setBackground(Color.black);
    }
}
