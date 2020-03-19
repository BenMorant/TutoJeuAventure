package adventuregame.business;

import adventuregame.entity.Weapon;

public interface HeroService {

    void instantiateAbility(int abilityToConfigure);

    void instantiateAbilityMax(int abilityMaxToConfigure);

    void instantiateStrength(int strengthToConfigure);

    void instantiateStrengthMax(int strengthMaxToConfigure);

    void instantiateMp(int mpToConfigure);

    void instantiateMpMax(int mpMaxToConfigure);

    void instantiateHp(int hpToConfigure);

    void instantiateHpMax(int hpMaxToConfigure);

    void instantiateHeroPicture(String pictureToConfigure);

    void instantiateHeroCurrentWeapon(Weapon heroCurrentWeaponToConfigure);

}
