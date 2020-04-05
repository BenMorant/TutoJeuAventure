package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {


    public GamePanel(int x, int y, int width, int height) {
        super();
        setBounds(x, y, width, height);
        setBackground(Color.black);
    }
}
