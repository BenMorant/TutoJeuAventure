package adventuregame.front;

import adventuregame.appswing.Game;
import adventuregame.appswing.UI;
import adventuregame.business.HeroService;
import adventuregame.entity.Hero;
import adventuregame.entity.Weapon;

public class HeroPanel {

    Hero hero;
    UI ui;
    HeroService heroService;

    public void displayAbility(int abilityToConfigure) {
        heroService.instantiateAbility(abilityToConfigure);
        ui.abilityLabelNumber.setText("" + heroAbility);
    }

    public void displayAbilityMax(int abilityMaxToConfigure) {
        heroService.instantiateAbilityMax(abilityMaxToConfigure);
        ui.abilityMaxLabelNumber.setText("" + heroAbilityMax);
    }

    public void displayStrength(int strengthToConfigure) {
        heroService.instantiateStrength(strengthToConfigure);
        ui.strengthLabelNumber.setText("" + heroStrength);
    }

    public void displayStrengthMax(int strengthMaxToConfigure) {
        heroService.instantiateStrengthMax(strengthMaxToConfigure);
        ui.strengthMaxLabelNumber.setText("" + heroStrengthMax);
    }

    public void displayMp(int mpToConfigure) {
        heroService.instantiateMp(mpToConfigure);
        ui.mpLabelNumber.setText("" + heroMp);
    }

    public void displayMpMax(int mpMaxToConfigure) {
        heroService.instantiateMpMax(mpMaxToConfigure);
        ui.mpMaxLabelNumber.setText("" + heroMpMax);
    }

    public void displayHp(int hpToConfigure) {
        heroService.instantiateHp(hpToConfigure);
        ui.hpLabelNumber.setText("" + heroHp);
    }


    public void displayHpMax(int hpMaxToConfigure) {
        heroService.instantiateHpMax(hpMaxToConfigure);
        ui.hpMaxLabelNumber.setText("" + heroHpMax);
    }

    public void displayHeroPicture(String pictureToConfigure) {
        heroService.instantiateHeroPicture(pictureToConfigure);
        ui.setImage(ui.imageLabelPicture, heroPicture);
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
