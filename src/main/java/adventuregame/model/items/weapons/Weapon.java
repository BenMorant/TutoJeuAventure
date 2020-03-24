package adventuregame.model.items.weapons;

import adventuregame.model.items.Item;

public abstract class Weapon extends Item {

    private String name;
    private int damageMax;
    private String image;
    private int wearMax;
    private int wear;

    public static int getDamageWeapon(int heroStrength, int heroStrengthMax, int weaponDamageMax) {
        return (int) (Math.random() * (weaponDamageMax * (heroStrength / heroStrengthMax + 1)));
    }

}
