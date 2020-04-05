package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class MainTextArea extends JTextArea {

    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public MainTextArea() {
        super("Yo");
        setBounds(40, 650, 750, 350);
        setBackground(Color.gray);
        setForeground(Color.white);
        setFont(normalFont);
        setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
    }
}
