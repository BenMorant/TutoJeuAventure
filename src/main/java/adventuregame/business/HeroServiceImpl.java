package adventuregame.business;

import adventuregame.entity.Hero;

public class HeroServiceImpl implements HeroService {

    Hero hero;

    @Override
    public void instantiateAbility(int abilityToConfigure) {
        hero.setAbility(abilityToConfigure);
        heroAbility = hero.getAbility();
    }

    @Override
    public void instantiateAbilityMax(int abilityMaxToConfigure) {
        hero.setAbilityMax(abilityMaxToConfigure);
        heroAbilityMax = hero.getAbilityMax();
    }

    @Override
    public void instantiateStrength(int strengthToConfigure) {
        hero.setStrength(strengthToConfigure);
        heroStrength = hero.getStrength();
    }

    @Override
    public void instantiateStrengthMax(int strengthMaxToConfigure) {
        hero.setStrengthMax(strengthMaxToConfigure);
        heroStrengthMax = hero.getStrengthMax();
    }

    @Override
    public void instantiateMp(int mpToConfigure) {
        hero.setMp(mpToConfigure);
        heroMp = hero.getMp();
    }

    @Override
    public void instantiateMpMax(int mpMaxToConfigure) {
        hero.setMpMax(mpMaxToConfigure);
        heroMpMax = hero.getMpMax();
    }

    @Override
    public void instantiateHp(int hpToConfigure) {
        hero.setHp(hpToConfigure);
        heroHp = hero.getHp();
    }

    @Override
    public void instantiateHpMax(int hpMaxToConfigure) {
        hero.setHpMax(hpMaxToConfigure);
        heroHpMax = hero.getHpMax();
    }

    @Override
    public void instantiateHeroPicture(String pictureToConfigure) {
        hero.setImage(pictureToConfigure);
        heroPicture = hero.getImage();
    }


}
