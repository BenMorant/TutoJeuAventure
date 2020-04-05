package adventuregame.view;

public class Game {

    private GameFrame gameBoard;

    public Game() {
        gameBoard = new GameFrame();
        start();

    }

    private void start() {
        gameBoard.setVisible(true);
    }
}
