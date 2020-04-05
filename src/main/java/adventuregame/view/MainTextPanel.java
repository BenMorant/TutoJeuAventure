package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class MainTextPanel extends JPanel {

    private final MainTextArea mainTextArea;

    public MainTextPanel() {
        setBounds(40, 650, 750, 550);
        setBackground(Color.red);
        mainTextArea = new MainTextArea();
        add(mainTextArea);
    }
}
