package adventuregame.model.people.monsters;

import adventuregame.model.items.Item;
import adventuregame.model.people.People;

public abstract class Monster extends People {


    protected String attackMessage;
    protected int stealDifficulty;
    protected Item monsterItem;

    public Monster(int gender, String name, String image, String description, int hp, int mp, int strength, String attackMessage, int stealDifficulty, Item monsterItem) {
        super(gender, name, image, description, hp, mp, strength);
        this.attackMessage = attackMessage;
        this.stealDifficulty = stealDifficulty;
        this.monsterItem = monsterItem;
    }

    public String getAttackMessage() {
        return attackMessage;
    }

    public void setAttackMessage(String attackMessage) {
        this.attackMessage = attackMessage;
    }

    public int getStealDifficulty() {
        return stealDifficulty;
    }

    public void setStealDifficulty(int stealDifficulty) {
        this.stealDifficulty = stealDifficulty;
    }

    public Item getMonsterItem() {
        return monsterItem;
    }

    public void setMonsterItem(Item monsterItem) {
        this.monsterItem = monsterItem;
    }
}
