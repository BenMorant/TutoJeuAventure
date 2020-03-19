package adventuregame.front;

import adventuregame.appswing.Game;
import adventuregame.entity.Weapon;

public class HeroPanel {

    public void displayAbility(int abilityToConfigure) {
        hero.setAbility(abilityToConfigure);
        heroAbility = hero.getAbility();
        ui.abilityLabelNumber.setText("" + heroAbility);
    }

    public void displayAbilityMax(int abilityMaxToConfigure) {
        hero.setAbilityMax(abilityMaxToConfigure);
        heroAbilityMax = hero.getAbilityMax();
        ui.abilityMaxLabelNumber.setText("" + heroAbilityMax);
    }

    public void displayStrength(int strengthToConfigure) {
        hero.setStrength(strengthToConfigure);
        heroStrength = hero.getStrength();
        ui.strengthLabelNumber.setText("" + heroStrength);
    }

    public void displayStrengthMax(int strengthMaxToConfigure) {
        hero.setStrengthMax(strengthMaxToConfigure);
        heroStrengthMax = hero.getStrengthMax();
        ui.strengthMaxLabelNumber.setText("" + heroStrengthMax);
    }

    public void displayMp(int mpToConfigure) {
        hero.setMp(mpToConfigure);
        heroMp = hero.getMp();
        ui.mpLabelNumber.setText("" + heroMp);
    }

    public void displayMpMax(int mpMaxToConfigure) {
        hero.setMpMax(mpMaxToConfigure);
        heroMpMax = hero.getMpMax();
        ui.mpMaxLabelNumber.setText("" + heroMpMax);
    }

    public void displayHp(int hpToConfigure) {
        hero.setHp(hpToConfigure);
        heroHp = hero.getHp();
        ui.hpLabelNumber.setText("" + heroHp);
    }

    public void displayHpMax(int hpMaxToConfigure) {
        hero.setHpMax(hpMaxToConfigure);
        heroHpMax = hero.getHpMax();
        ui.hpMaxLabelNumber.setText("" + heroHpMax);
    }

    public void displayHeroPicture(String pictureToConfigure) {
        hero.setImage(pictureToConfigure);
        heroPicture = hero.getImage();
        ui.getImage(ui.imageLabelPicture, heroPicture);
    }

    public void displayHeroCurrentWeapon(Weapon weaponToConfigure) {
        hero.setCurrentWeapon(weaponToConfigure);
        heroCurrentWeapon = hero.getCurrentWeapon();
        //weapon name
        heroCurrentWeaponName = heroCurrentWeapon.getName();
        ui.weaponLabelName.setText(heroCurrentWeaponName);
        //damage max
        heroCurrentWeaponDamageMax = heroCurrentWeapon.getDamageMax();
        ui.weaponLabelDamageMaxNumber.setText("" + heroCurrentWeaponDamageMax);
        //wear max
        heroCurrentWeaponWearMax = heroCurrentWeapon.getWearMax();
        ui.weaponLabelWearMaxLabelNumber.setText("" + heroCurrentWeapon.getWearMax());
        //wear
        heroCurrentWeapon.setWear(Game.getRandomNumberBetweenTwoBounds(0, heroCurrentWeaponWearMax - 1));
        heroCurrentWeaponWear = heroCurrentWeapon.getWear();
        ui.weaponLabelWearNumber.setText("" + heroCurrentWeapon.getWear());
    }
}
