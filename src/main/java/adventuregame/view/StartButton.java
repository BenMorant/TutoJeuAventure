package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class StartButton extends JButton {

    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    private ChoiceHandler choiceHandler;

    public StartButton() {
        super("C'EST PARTI !");
        setBackground(Color.black);
        setForeground(Color.green);
        setFont(normalFont);
        setFocusPainted(false);
        addActionListener(choiceHandler);
        setActionCommand("start");
    }
}
