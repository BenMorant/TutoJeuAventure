package adventuregame.model.uielements;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.people.Hero;

public class Board {

    private char[][] boardData = new char[20][20];
    private Hero hero;

    public Board() {

        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);
    }

    @Override
    public String toString() {
//        return "Board{" +
//                "boardData=" + Arrays.toString(boardData) +
//                ", hero=" + hero +
//                '}';
        return boardData.toString();
    }
}
