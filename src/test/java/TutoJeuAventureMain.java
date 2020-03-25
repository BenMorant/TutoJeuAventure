import adventuregame.model.items.weapons.LongSword;
import adventuregame.model.items.weapons.Weapon;
import adventuregame.model.people.monsters.Goblin;
import adventuregame.model.people.monsters.Monster;

public class TutoJeuAventureMain {

    public static void main(String[] args) {

        Monster goblin = new Goblin();

        System.out.println(goblin.getImage());

        Weapon epee = new LongSword();
        System.out.println("epee = " + epee.getImage());

    }
}
