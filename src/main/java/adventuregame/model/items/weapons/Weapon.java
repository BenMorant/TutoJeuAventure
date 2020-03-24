package adventuregame.model.items.weapons;

import adventuregame.model.items.Item;

public abstract class Weapon extends Item {

    protected int damageMax = 0;
    protected int wearMax = 0;
    protected int wear = 0;


    public Weapon(int gender, String name, String image, String description, int weight, int damageMax, int wearMax, int wear) {
        super(gender, name, image, description, weight);
        this.damageMax = damageMax;
        this.wearMax = wearMax;
        this.wear = wear;
    }

    public static int giveDamage(int strength, int strengthMax, int weaponDamageMax) {
        return (int) (Math.random() * (weaponDamageMax * (strength / strengthMax + 1)));
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public int getWearMax() {
        return wearMax;
    }

    public void setWearMax(int wearMax) {
        this.wearMax = wearMax;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

}
