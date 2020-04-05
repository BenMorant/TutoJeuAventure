package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GameLabel extends JLabel {

    public GameLabel(String text, Color foregroundColor, Font font) {
        super(text);
        setForeground(foregroundColor);
        setFont(font);

    }
}
