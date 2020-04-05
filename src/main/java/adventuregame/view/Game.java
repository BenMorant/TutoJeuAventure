package adventuregame.view;

public class Game {

    private GameFrame gameBoard;
    private VisibilityManager visibilityManager;

    public Game() {
        gameBoard = new GameFrame();
        visibilityManager = new VisibilityManager(gameBoard);
        start();

    }

    private void start() {
        gameBoard.setVisible(true);
        visibilityManager.showTitleScreen();
    }
}
