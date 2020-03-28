package adventuregametest;

import adventuregame.model.uielements.Board;
import adventuregame.view.GameBoard;

public class TutoJeuAventureMain {

    public static void main(String[] args) {

        Board board = new Board();
        System.out.println(board);

        GameBoard gameBoard = new GameBoard();
        gameBoard.start();

    }
}
