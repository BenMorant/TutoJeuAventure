package adventuregame.model.uielements;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.people.Hero;

import java.util.Arrays;

public class Board {

    private char[][] boardData;
    private Hero hero;

    public Board() {
        boardData = null;
        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardData=" + Arrays.toString(boardData) +
                ", hero=" + hero +
                '}';
    }
}
