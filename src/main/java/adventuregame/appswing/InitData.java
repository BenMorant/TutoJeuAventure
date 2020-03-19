package adventuregame.appswing;

import adventuregame.entity.Knife;
import adventuregame.entity.Weapon;
import adventuregame.front.HeroPanel;

public class InitData {

    HeroPanel heroPanel;
    int heroHpMax = Game.getRandomNumberBetweenTwoBounds(7, 15);
    // TODO = 0 for now
    int heroMpMax = Game.getRandomNumberBetweenTwoBounds(0, 0);
    int heroHp = heroHpMax;
    // TODO choose picture
    String heroPicture = "hero/rambo.jpg";
    int heroMp = heroMpMax;
    //TODO weapon to choose
    Weapon heroCurrentWeapon = new Knife();
    int heroStrengthMax = Game.getRandomNumberBetweenTwoBounds(0, 10);
    int heroStrength = heroStrengthMax;
    //TODO : for now...
    int heroAbilityMax = 10 - heroStrengthMax;
    int heroAbility = heroAbilityMax;

    public void initializeHeroAbility() {
        heroPanel.displayAbility(heroAbility);
    }

    public void initializeHeroAbilityMax() {
        heroPanel.displayAbilityMax(heroAbilityMax);
    }

    public void initializeHeroStrength() {
        heroPanel.displayStrength(heroStrength);
    }

    public void initializeHeroStrengthMax() {
        heroPanel.displayStrengthMax(heroStrengthMax);
    }

    public void initializeHeroWeapon() {
        heroPanel.displayHeroCurrentWeapon(heroCurrentWeapon);
    }

    public void initializeHeroMp() {
        heroPanel.displayMp(heroMp);
    }

    public void initializeHeroPicture() {
        heroPanel.displayHeroPicture(heroPicture);
        System.out.println();
    }

    public void initializeHeroHpMax() {
        heroPanel.displayHpMax(heroHpMax);
    }

    public void initializeHeroHp() {
        heroPanel.displayHp(heroHp);
    }

    public void initializeHeroMpMax() {
        heroPanel.displayMpMax(heroMpMax);
    }
}
