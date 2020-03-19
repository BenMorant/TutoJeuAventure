package adventuregame.dao;

public interface HeroDao {

    void configureAbility(int abilityToConfigure);

    void configureAbilityMax(int abilityMaxToConfigure);

    void configureStrength(int strengthToConfigure);

    void configureStrengthMax(int strengthMaxToConfigure);

    void configureMp(int mpToConfigure);

    void configureMpMax(int mpMaxToConfigure);

    void configureHp(int hpToConfigure);

    void configureHpMax(int hpMaxToConfigure);

    void configureHeroPicture(String pictureToConfigure);
}
