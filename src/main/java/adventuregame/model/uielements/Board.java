package adventuregame.model.uielements;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.people.Hero;
import adventuregame.model.people.People;
import adventuregame.model.people.monsters.Mandragore;
import adventuregame.model.people.monsters.Monster;

public class Board {

    public static final String TITLE = "L'aventure n'attend pas";

    private People hero;
    private Monster mandragore;

    public Board() {

        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);
        mandragore = new Mandragore();
    }

    @Override
    public String toString() {
        return "Board{" +
                "hero=" + hero +
                ", mandragore=" + mandragore +
                '}';
    }
}
