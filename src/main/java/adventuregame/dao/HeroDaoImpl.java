package adventuregame.dao;

import adventuregame.entity.Hero;

public class HeroDaoImpl implements HeroDao {

    Hero hero;
    private int heroAbility, heroAbilityMax, heroStrength, heroStrengthMax, heroMp, heroMpMax, heroHp, heroHpMax;
    private String heroPicture;

    @Override
    public void configureAbility(int abilityToConfigure) {
        hero.setAbility(abilityToConfigure);
        heroAbility = hero.getAbility();
    }

    @Override
    public void configureAbilityMax(int abilityMaxToConfigure) {
        hero.setAbilityMax(abilityMaxToConfigure);
        heroAbilityMax = hero.getAbilityMax();
    }

    @Override
    public void configureStrength(int strengthToConfigure) {
        hero.setStrength(strengthToConfigure);
        heroStrength = hero.getStrength();
    }

    @Override
    public void configureStrengthMax(int strengthMaxToConfigure) {
        hero.setStrengthMax(strengthMaxToConfigure);
        heroStrengthMax = hero.getStrengthMax();
    }

    @Override
    public void configureMp(int mpToConfigure) {
        hero.setMp(mpToConfigure);
        heroMp = hero.getMp();
    }

    @Override
    public void configureMpMax(int mpMaxToConfigure) {
        hero.setMpMax(mpMaxToConfigure);
        heroMpMax = hero.getMpMax();
    }

    @Override
    public void configureHp(int hpToConfigure) {
        hero.setHp(hpToConfigure);
        heroHp = hero.getHp();
    }

    @Override
    public void configureHpMax(int hpMaxToConfigure) {
        hero.setHpMax(hpMaxToConfigure);
        heroHpMax = hero.getHpMax();
    }

    @Override
    public void configureHeroPicture(String pictureToConfigure) {
        hero.setImage(pictureToConfigure);
        heroPicture = hero.getImage();
    }
}
