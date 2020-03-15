package JeuAventureSwing.weaponz;

public class SuperWeapon {

    public String name;
    public int damageMax;
    public String image;
    public int wear;
    public int wearMax;

    public static int getDamageWeapon(int playerStrength, int playerStrengthMax, int weaponDamageMax) {
        return (int) (Math.random() * (weaponDamageMax * (playerStrength / playerStrengthMax + 1)));
    }

}
