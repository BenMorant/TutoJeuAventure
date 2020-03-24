package adventuregame.model.people.monsters;

import adventuregame.model.items.SilverRing;


public class Goblin extends Monster {

    public Goblin() {
        super(2, "Gobelin", "people/monsters/goblin.jpg", "Il est laid le Gobelin", 20, 0, 6, "Le gobelin vous touche avec son baton !", 5, new SilverRing());
    }
}
