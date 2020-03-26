package adventuregame.model.people.hero;

import adventuregame.model.items.Item;
import adventuregame.model.items.weapons.Weapon;
import adventuregame.model.people.People;
import adventuregame.model.utils.StatsListener;
import adventuregame.model.utils.WordsListener;

import java.util.ArrayList;
import java.util.List;

public class Hero extends People {

    private int hpMax;
    private int mpMax;
    private int ability;
    private int abilityMax;
    private int strengthMax;
    private Weapon currentWeapon;
    private Item currentItem;
    private List<StatsListener> statsListeners = new ArrayList<>();
    private List<WordsListener> wordsListeners = new ArrayList<>();

    public Hero(int gender, String name, String image, String description, int hp, int mp, int strength, int hpMax, int mpMax, int ability, int abilityMax, int strengthMax, Weapon currentWeapon, Item currentItem) {
        super(gender, name, image, description, hp, mp, strength);
        this.image = "./src/main/resources/pix/people/hero/" + image;
        this.hpMax = hpMax;
        this.mpMax = mpMax;
        this.ability = ability;
        this.abilityMax = abilityMax;
        this.strengthMax = strengthMax;
        this.currentWeapon = currentWeapon;
        this.currentItem = currentItem;
    }

    public void addStatListener(StatsListener statsListener) {
        statsListeners.add(statsListener);
    }

    public void addWordListener(WordsListener wordListener) {
        wordsListeners.add(wordListener);
    }

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
                ", statsListeners=" + statsListeners +
                ", wordsListeners=" + wordsListeners +
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
