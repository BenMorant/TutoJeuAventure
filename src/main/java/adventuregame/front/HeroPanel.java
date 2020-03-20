package adventuregame.front;

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
        ui.abilityLabelNumber.setText("" + abilityToConfigure);
    }

    public void displayAbilityMax(int abilityMaxToConfigure) {
        heroService.instantiateAbilityMax(abilityMaxToConfigure);
        ui.abilityMaxLabelNumber.setText("" + abilityMaxToConfigure);
    }

    public void displayStrength(int strengthToConfigure) {
        heroService.instantiateStrength(strengthToConfigure);
        ui.strengthLabelNumber.setText("" + strengthToConfigure);
    }

    public void displayStrengthMax(int strengthMaxToConfigure) {
        heroService.instantiateStrengthMax(strengthMaxToConfigure);
        ui.strengthMaxLabelNumber.setText("" + strengthMaxToConfigure);
    }

    public void displayMp(int mpToConfigure) {
        heroService.instantiateMp(mpToConfigure);
        ui.mpLabelNumber.setText("" + mpToConfigure);
    }

    public void displayMpMax(int mpMaxToConfigure) {
        heroService.instantiateMpMax(mpMaxToConfigure);
        ui.mpMaxLabelNumber.setText("" + mpMaxToConfigure);
    }

    public void displayHp(int hpToConfigure) {
        heroService.instantiateHp(hpToConfigure);
        ui.hpLabelNumber.setText("" + hpToConfigure);
    }


    public void displayHpMax(int hpMaxToConfigure) {
        heroService.instantiateHpMax(hpMaxToConfigure);
        ui.hpMaxLabelNumber.setText("" + hpMaxToConfigure);
    }


    public void displayHeroCurrentWeapon(Weapon heroCurrentWeaponToConfigure) {
        heroService.instantiateHeroCurrentWeapon(heroCurrentWeaponToConfigure);
        ui.weaponLabelName.setText(heroCurrentWeaponToConfigure.getName());
        ui.weaponLabelDamageMaxNumber.setText("" + heroCurrentWeaponToConfigure.getDamageMax());
        ui.weaponLabelWearMaxLabelNumber.setText("" + heroCurrentWeaponToConfigure.getWearMax());
        ui.weaponLabelWearNumber.setText("" + heroCurrentWeaponToConfigure.getWear());
    }
}
