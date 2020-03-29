package adventuregametest;

import adventuregame.model.uielements.Board;
import adventuregame.view.board.GameBoard;

public class TutoJeuAventureMain {

    public static void main(String[] args) {
//Back end, for test purposes only
        Board board = new Board();
        System.out.println(board);
//front end
        GameBoard gameBoard = new GameBoard();
        gameBoard.start();

    }
}
