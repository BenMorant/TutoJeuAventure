//package adventuregametest.view;
//
//import adventuregame.view.panels.genericpanels.MasterPanel;
//import org.junit.jupiter.api.Test;
//
//import java.awt.*;
//
//import static adventuregame.view.panels.genericpanels.MasterPanel.DEFAULT_HEIGHT;
//import static adventuregame.view.panels.genericpanels.MasterPanel.DEFAULT_WIDTH;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MasterPanelTest {
//
//    private MasterPanel masterPanelTest = new MasterPanel();
//
//    @Test
//    void testGamePanelDimensions() {
//        System.out.println("gamePanelTest.getPreferredSize() = " + masterPanelTest.getPreferredSize());
//        assertThat(masterPanelTest.getPreferredSize()).as("GamePanel's size " + masterPanelTest.getPreferredSize() + " should be equal to Default size " + DEFAULT_HEIGHT + " , " + DEFAULT_WIDTH).isEqualTo(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//
//    }
//}
