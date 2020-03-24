package adventuregame.model.people.monsters;

import adventuregame.model.items.LittleDragonTooth;

public class LittleDragon extends Monster {
    public LittleDragon() {
        super(2, "Petit dragon", "people/monsters/little_dragon.jpg", "un jeune dragon... d'au moins 200 ans", 60, 0, 8, "Le petit dragon crache un jet de flammes par ses narines !", 6, new LittleDragonTooth());
    }
}
