package adventuregame.model.uielements;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.people.Hero;

import java.util.Arrays;

public class Board {

    private char[][] boardData = new char[20][20];
    private Hero hero;

    public Board() {

        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);
    }


    public String toString() {
        return "Board{" +
                "boardData=" + Arrays.toString(boardData) +
                ", hero=" + hero +
                '}';

//        return boardData.toString();
    }

    public char[][] getBoardDatar() {
        for (int i = 0; i < boardData.length; i++) {
            for (int o = 0; o < boardData[i].length; o++) {
                boardData[i][o] = 'x';
                //     System.out.print(boardData[i][o]);
            }
            //   System.out.println( );
        }
        return boardData;
    }
}
