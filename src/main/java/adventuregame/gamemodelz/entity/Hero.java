package adventuregame.gamemodelz.entity;

import adventuregame.gamemodelz.weaponz.SuperWeapon;

public class Hero {

    private int hp;
    private int hpMax;
    private int mp;
    private int mpMax;
    private int ability;
    private int strength;
    private int abilityMax;
    private int strengthMax;
    private String picture = "hero/rambo.jpg";
    private SuperWeapon currentWeapon;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public SuperWeapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(SuperWeapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
