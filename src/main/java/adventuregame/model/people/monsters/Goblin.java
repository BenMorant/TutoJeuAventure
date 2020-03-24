package adventuregame.model.people.monsters;

import adventuregame.model.items.SilverRing;

public class Goblin extends Monster {

    public Goblin() {
        name = "Gobelin";
        hp = 20;
        damageMax = 6;
        attackMessage = "Le gobelin vous touche avec son baton !";
        image = "monsters/goblin.jpg";
        stealDifficulty = 5;
        monsterObject = new SilverRing();

    }
}
