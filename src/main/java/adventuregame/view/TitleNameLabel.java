package adventuregame.view;

import javax.swing.*;
import java.awt.*;

import static adventuregame.model.uielements.Board.TITLE;

public class TitleNameLabel extends JLabel {

    private Font titleFont = new Font("Times New Roman", Font.BOLD, 52);

    public TitleNameLabel() {
        super(TITLE.toUpperCase());
        setForeground(Color.white);
        setFont(titleFont);
    }
}
