package adventuregame.gamemodelz.entity;

public class SuperWeapon {

    protected String name;
    protected int damageMax;
    protected String image;
    protected int wearMax;
    private int wear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

    public int getWearMax() {
        return wearMax;
    }

    public void setWearMax(int wearMax) {
        this.wearMax = wearMax;
    }


    public static int getDamageWeapon(int heroStrength, int heroStrengthMax, int weaponDamageMax) {
        return (int) (Math.random() * (weaponDamageMax * (heroStrength / heroStrengthMax + 1)));
    }
}
