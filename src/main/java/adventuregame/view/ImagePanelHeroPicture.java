package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class ImagePanelHeroPicture extends JPanel {

    private ImageLabelHeroPicture imageLabelPicture;

    public ImagePanelHeroPicture() {
        super();
        setBounds(960, 70, 140, 175);
        setBackground(Color.pink);
        imageLabelPicture = new ImageLabelHeroPicture();
        add(imageLabelPicture);
    }


}
