//package adventuregametest.view;
//
//import adventuregame.view.MasterPanel;
//import org.junit.jupiter.api.Test;
//
//import javax.swing.*;
//import java.awt.*;
//
//import static adventuregame.view.MasterPanel.DEFAULT_HEIGHT;
//import static adventuregame.view.MasterPanel.DEFAULT_WIDTH;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MasterPanelTest {
//
//    private JPanel masterPanelTest = new MasterPanel();
//
//    @Test
//    void testGamePanelDimensions() {
//        System.out.println("masterPanelTest.getPreferredSize() = " + masterPanelTest.getPreferredSize());
//        assertThat(masterPanelTest.getPreferredSize()).as("masterPanel's size " + masterPanelTest.getPreferredSize() + " should be equal to Default size " + DEFAULT_HEIGHT + " , " + DEFAULT_WIDTH).isEqualTo(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//    }
//
//}
