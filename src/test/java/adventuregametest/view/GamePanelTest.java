package adventuregametest.view;

import adventuregame.view.GamePanel;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static adventuregame.view.GamePanel.DEFAULT_HEIGHT;
import static adventuregame.view.GamePanel.DEFAULT_WIDTH;
import static org.assertj.core.api.Assertions.assertThat;

public class GamePanelTest {

    private GamePanel gamePanelTest = new GamePanel();

    @Test
    void testGamePanelDimensions() {
        System.out.println("gamePanelTest.getPreferredSize() = " + gamePanelTest.getPreferredSize());
        assertThat(gamePanelTest.getPreferredSize()).as("GamePanel's size " + gamePanelTest.getPreferredSize() + " should be equal to Default size " + DEFAULT_HEIGHT + " , " + DEFAULT_WIDTH).isEqualTo(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));

    }
}
