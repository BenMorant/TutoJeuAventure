package adventuregame.view.panels.titlepanel;

import adventuregame.view.GameButton;
import adventuregame.view.GamePanel;

public class StartButtonPanel extends GamePanel {

    private GameButton startButton;

    public StartButtonPanel() {
        super(500, 600, 250, 120, null);
        System.out.println("je suis là");
        this.setVisible(true);
        startButton = new StartButton();
        System.out.println(startButton.getText());

        start();

    }

    public void start() {
        setVisible(true);
        buildButton();
    }

    private void buildButton() {

        this.add(startButton);

    }
}
