package adventuregame.view;

import javax.swing.*;

public class GameImageLabel extends JLabel {

    private ImageIcon image;

    public GameImageLabel() {
        super("");
        image = new ImageIcon();
        setIcon(image);


    }
}
