package adventuregame.model.people.monsters;

import adventuregame.model.items.SilverRing;


public class Goblin extends Monster {

    public Goblin() {
        super(2, "Gobelin", "people/monsters/goblin.jpg", "Il est laid le Gobelin", 20, 0, 6, "Le gobelin vous touche avec son baton !", 5, new SilverRing());
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "attackMessage='" + attackMessage + '\'' +
                ", stealDifficulty=" + stealDifficulty +
                ", monsterItem=" + monsterItem +
                ", hp=" + hp +
                ", mp=" + mp +
                ", strength=" + strength +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
