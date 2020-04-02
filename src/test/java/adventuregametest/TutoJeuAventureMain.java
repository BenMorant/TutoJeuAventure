package adventuregametest;

import adventuregame.model.people.monsters.Mandragore;
import adventuregame.model.people.monsters.Monster;
import adventuregame.model.uielements.Board;
import adventuregame.view.GameBoard;

public class TutoJeuAventureMain {

    public static void main(String[] args) {
//Back end, for test purposes only
        Board board = new Board();
        System.out.println(board);
//front end
        GameBoard gameBoard = new GameBoard();
        gameBoard.start();

        Monster mandragore = new Mandragore();
        System.out.println(mandragore.toString());


    }
}
