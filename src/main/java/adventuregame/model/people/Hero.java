package adventuregame.model.people;

import adventuregame.model.items.Item;
import adventuregame.model.items.weapons.Weapon;
import adventuregame.model.utils.EntityHelper;

public class Hero extends People {

    private int hpMax = 0;
    private int mpMax = 0;
    private int ability = 0;
    private int abilityMax = 0;
    private int strengthMax = 0;
    private Weapon currentWeapon = null;
    private Item currentItem = null;

    public Hero(int gender, String name, String image, String description, Weapon currentWeapon, Item currentItem) {
        super(gender, name, image, description, 0, 0, 0);
        this.strengthMax = EntityHelper.getRandomNumberBetweenTwoBounds(0, 10);
        this.hpMax = EntityHelper.getRandomNumberBetweenTwoBounds(7, 15);
        this.mpMax = EntityHelper.getRandomNumberBetweenTwoBounds(0, 0);
        this.abilityMax = 10 - this.strengthMax;
        this.hp = this.hpMax;
        this.mp = this.mpMax;
        this.strength = this.strengthMax;
        this.ability = this.abilityMax;
        this.currentWeapon = currentWeapon;
        this.currentItem = currentItem;
        this.image = "./src/main/resources/pix/items/hero/" + image;
    }

    //    public Hero() {
//        super();
//        this.gender = 2;
//        this.name = "Loup Ardent";
//        this.image = "./src/main/resources/pix/people/hero/rambo.jpg";
//        this.description = "Seriez vous l'Elu ?";
//        this.hp = this.hpMax;
//        this.mp = this.mpMax;
//        this.strength = strengthMax;
//        this.hpMax = EntityHelper.getRandomNumberBetweenTwoBounds(7, 15);
//        this.mpMax = EntityHelper.getRandomNumberBetweenTwoBounds(0, 0);
//        this.ability = this.abilityMax;
//        this.abilityMax = 10 - this.strengthMax;
//        this.strength = this.strengthMax;
//        this.strengthMax = EntityHelper.getRandomNumberBetweenTwoBounds(0, 10);
//        this.currentWeapon = new Knife();
//        this.currentItem = null;
//
//    }

//    public Hero(int gender, String name, String image, String description, int hp, int mp, int strength, int hpMax, int mpMax, int ability, int abilityMax, int strengthMax, Weapon currentWeapon, Item currentItem) {
//        super(gender, name, image, description, hp, mp, strength);
//        this.image = "./src/main/resources/pix/people/hero/" + image;
//        this.hpMax = hpMax;
//        this.mpMax = mpMax;
//        this.ability = ability;
//        this.abilityMax = abilityMax;
//        this.strengthMax = strengthMax;
//        this.currentWeapon = currentWeapon;
//        this.currentItem = currentItem;
//    }



    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getMpMax() {
        return mpMax;
    }

    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getAbilityMax() {
        return abilityMax;
    }

    public void setAbilityMax(int abilityMax) {
        this.abilityMax = abilityMax;
    }

    public int getStrengthMax() {
        return strengthMax;
    }

    public void setStrengthMax(int strengthMax) {
        this.strengthMax = strengthMax;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hpMax=" + hpMax +
                ", mpMax=" + mpMax +
                ", ability=" + ability +
                ", abilityMax=" + abilityMax +
                ", strengthMax=" + strengthMax +
                ", currentWeapon=" + currentWeapon +
                ", currentItem=" + currentItem +
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
