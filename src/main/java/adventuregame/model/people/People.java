package adventuregame.model.people;

import adventuregame.model.GenericEntity;

public abstract class People extends GenericEntity {

    protected int hp;
    protected int mp;
    protected int strength;

    public People(int gender, String name, String image, String description, int hp, int mp, int strength) {
        super(gender, name, image, description);
        this.hp = hp;
        this.mp = mp;
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
