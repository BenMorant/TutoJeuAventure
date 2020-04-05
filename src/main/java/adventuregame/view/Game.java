package adventuregame.view;

public class Game {

    private GameBoard gameBoard;

    public Game() {
        gameBoard = new GameBoard();
        start();

    }

    private void start() {
        gameBoard.setVisible(true);
    }
}
