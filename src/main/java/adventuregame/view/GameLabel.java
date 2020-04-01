package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GameLabel extends JLabel {

    public GameLabel(String label, Font font, Color foregroundColor) {
        super();
        this.setText(label);
        this.setForeground(foregroundColor);
        this.setFont(font);
    }


}
