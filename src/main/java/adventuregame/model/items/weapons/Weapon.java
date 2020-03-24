package adventuregame.model.items.weapons;

import adventuregame.model.items.Item;

public abstract class Weapon extends Item {

    private int damageMax;
    private int wearMax;
    private int wear;

    public Weapon(String name, String image, int weight, int damageMax, int wearMax, int wear) {
        super(name, image, weight);
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
