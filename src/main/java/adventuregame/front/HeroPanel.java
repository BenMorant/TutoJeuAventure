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

    public void displayHeroCurrentWeapon(Weapon heroCurrentWeaponToConfigure) {
        heroService.instantiateHeroCurrentWeapon(heroCurrentWeaponToConfigure);
        ui.weaponLabelName.setText(heroCurrentWeaponToConfigure.getName());
        ui.weaponLabelDamageMaxNumber.setText("" + heroCurrentWeaponToConfigure.getDamageMax());
        ui.weaponLabelWearMaxLabelNumber.setText("" + heroCurrentWeaponToConfigure.getWearMax());
        ui.weaponLabelWearNumber.setText("" + heroCurrentWeaponToConfigure.getWear());

        hero.setCurrentWeapon(heroCurrentWeaponToConfigure);
        heroCurrentWeapon = hero.getCurrentWeapon();

        hero.setStrength(strengthToConfigure);
        heroCurrentWeaponName = heroCurrentWeapon.getName();

        heroCurrentWeaponDamageMax = heroCurrentWeapon.getDamageMax();

        heroCurrentWeaponWearMax = heroCurrentWeapon.getWearMax();

        heroCurrentWeapon.setWear(Game.getRandomNumberBetweenTwoBounds(0, heroCurrentWeaponWearMax - 1));
        heroCurrentWeaponWear = heroCurrentWeapon.getWear();

    }
}
