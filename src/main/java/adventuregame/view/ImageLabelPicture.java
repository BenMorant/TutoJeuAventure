package adventuregame.view;

import javax.swing.*;

public class ImageLabelPicture extends JLabel {

    private ImageIcon image;

    public ImageLabelPicture() {
        super("");
        image = new ImageIcon();
        setIcon(image);


    }
}
