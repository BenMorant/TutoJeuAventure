package adventuregame.view;

public class Game {

    private GameFrame gameFrame;
   // private VisibilityManager visibilityManager;
    //   private ChoiceHandler choiceHandler = new ChoiceHandler();

    public Game() {
        gameFrame = new GameFrame();
        // visibilityManager = new VisibilityManager(gameFrame);
        start();

    }

    private void start() {
        gameFrame.setVisible(true);
        //  visibilityManager.showTitleScreen();
    }
}
