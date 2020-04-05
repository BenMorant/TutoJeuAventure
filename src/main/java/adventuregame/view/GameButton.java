package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GameButton extends JButton {

    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public GameButton(String text, ChoiceHandler choiceHandler, String actionCommand) {
        super(text);
        setBackground(Color.black);
        setForeground(Color.white);
        setFont(normalFont);
        setFocusPainted(false);
        addActionListener(choiceHandler);
        setActionCommand(actionCommand);
    }
}
