package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;
    private LayoutManager layout = null;


    public GamePanel(int x, int y, int width, int height, LayoutManager layout) {
        super();
        this.setBounds(x, y, width, height);
        this.setBackground(Color.yellow);
        this.setLayout(layout);
    }


    @Override
    public String toString() {
        return "GamePanel{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", layout=" + layout +
                '}';
    }
}
