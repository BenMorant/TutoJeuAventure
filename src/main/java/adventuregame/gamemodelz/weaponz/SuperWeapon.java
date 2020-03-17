package adventuregame.gamemodelz.weaponz;

public class SuperWeapon {

    public String name;
    public int damageMax;
    public String image;
    public int wear;
    public int wearMax;


    public static int getDamageWeapon(int heroStrength, int heroStrengthMax, int weaponDamageMax) {
        return (int) (Math.random() * (weaponDamageMax * (heroStrength / heroStrengthMax + 1)));
    }

}
