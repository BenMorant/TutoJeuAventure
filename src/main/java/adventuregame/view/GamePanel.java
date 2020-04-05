package adventuregame.view;

import javax.swing.*;

public class GamePanel extends JPanel {

    private int x;
    private int y;
    private int width;
    private int height;

    public GamePanel(int x, int y, int width, int height) {
        super();
        setBounds(x, y, width, height);
    }
}
