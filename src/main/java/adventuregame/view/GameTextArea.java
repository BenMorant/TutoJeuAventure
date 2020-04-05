package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GameTextArea extends JTextArea {

    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public GameTextArea(String text, int x, int y, int width, int height) {
        super(text);
        setBounds(x, y, width, height);
        setBackground(Color.black);
        setForeground(Color.white);
        setFont(normalFont);
        setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
    }
}
