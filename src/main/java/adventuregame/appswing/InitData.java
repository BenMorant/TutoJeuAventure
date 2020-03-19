package adventuregame.appswing;

import adventuregame.entity.Knife;
import adventuregame.entity.Weapon;
import adventuregame.front.HeroPanel;

public class InitData {

    HeroPanel heroPanel;

    public void initializeHeroAbility() {
        int heroAbility = heroAbilityMax;
        heroPanel.displayAbility(heroAbility);
    }

    public void initializeHeroAbilityMax() {
        //TODO : for now...
        int heroAbilityMax = 10 - heroStrengthMax;
        heroPanel.displayAbilityMax(heroAbilityMax);
    }

    public void initializeHeroStrength() {
        int heroStrength = heroStrengthMax;
        heroPanel.displayStrength(heroStrength);
    }

    public void initializeHeroStrengthMax() {
        int heroStrengthMax = Game.getRandomNumberBetweenTwoBounds(0, 10);
        heroPanel.displayStrengthMax(heroStrengthMax);
    }

    public void initializeHeroWeapon() {
        //TODO weapon to choose
        Weapon heroCurrentWeapon = new Knife();
        heroPanel.displayHeroCurrentWeapon(heroCurrentWeapon);
    }

    public void initializeHeroMp() {
        int heroMp = heroMpMax;
        heroPanel.displayMp(heroMp);
    }

    public void initializeHeroPicture() {
        // TODO choose picture
        String heroPicture = "hero/rambo.jpg";
        heroPanel.displayHeroPicture(heroPicture);
        System.out.println();
    }

    public void initializeHeroHpMax() {
        int heroHpMax = Game.getRandomNumberBetweenTwoBounds(7, 15);
        heroPanel.displayHpMax(heroHpMax);
    }

    public void initializeHeroHp() {
        int heroHp = heroHpMax;
        heroPanel.displayHp(heroHp);
    }

    public void initializeHeroMpMax() {
        // TODO = 0 for now
        int heroMpMax = Game.getRandomNumberBetweenTwoBounds(0, 0);
        heroPanel.displayMpMax(heroMpMax);
    }
}
