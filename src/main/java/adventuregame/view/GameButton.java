package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class GameButton extends JButton {

    ChoiceHandler choiceHandler;
    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public GameButton(String label, String yourChoice) {
        super();
        this.setText(label);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(normalFont);
        this.setFocusPainted(false);
        this.addActionListener(choiceHandler);
        this.setActionCommand(yourChoice);
    }

    public Font getNormalFont() {
        return normalFont;
    }

    public void setNormalFont(Font normalFont) {
        this.normalFont = normalFont;
    }

    public ChoiceHandler getChoiceHandler() {
        return choiceHandler;
    }

    public void setChoiceHandler(ChoiceHandler choiceHandler) {
        this.choiceHandler = choiceHandler;
    }

    @Override
    public String toString() {
        return "GenericButton{" +
                "normalFont=" + normalFont +
                ", choiceHandler=" + choiceHandler +
                ", model=" + model +
                ", changeListener=" + changeListener +
                ", actionListener=" + actionListener +
                ", itemListener=" + itemListener +
                ", changeEvent=" + changeEvent +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
