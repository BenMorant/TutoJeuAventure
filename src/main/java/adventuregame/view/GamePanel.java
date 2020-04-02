package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public abstract class GamePanel extends JPanel {

    public GamePanel(int x, int y, int width, int height, LayoutManager layout) {
        super();
        this.setBounds(x, y, width, height);
        this.setBackground(Color.black);
        this.setLayout(layout);
    }

}
