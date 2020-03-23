package adventuregame.service;

import adventuregame.entity.Hero;
import adventuregame.entity.Object;
import adventuregame.entity.Weapon;

public class HeroService {

    Hero hero = new Hero();

    public void instantiateHeroHp(int heroHpToInstantiate) {
        hero.setHp(heroHpToInstantiate);
    }

    public void instantiateHeroHpMax(int heroHpMaxToInstantiate) {
        hero.setHpMax(heroHpMaxToInstantiate);
    }
    public void instantiateHeroMp(int heroMpToInstantiate) {
        hero.setMp(heroMpToInstantiate);
    }
    public void instantiateHeroMpMax(int heroMpMaxToInstantiate) {
        hero.setMpMax(heroMpMaxToInstantiate);
    }

    public void instantiateHeroAbility(int heroAbilityToInstantiate) {
        hero.setAbility(heroAbilityToInstantiate);
    }

    public void instantiateHeroAbilityMax(int heroAbilityMaxToInstantiate) {
        hero.setAbilityMax(heroAbilityMaxToInstantiate);
    }

    public void instantiateHeroStrengthMax(int heroStrengthMaxToInstantiate) {
        hero.setStrengthMax(heroStrengthMaxToInstantiate);
    }

    public void instantiateHeroStrength(int heroStrengthToInstantiate) {
        hero.setStrength(heroStrengthToInstantiate);
    }

    public void instantiateHeroPicture(String heroPictureToInstantiate) {
        hero.setImage(heroPictureToInstantiate);
    }

    public Weapon instantiateHeroCurrentWeapon(Weapon heroCurrentWeaponToInstantiate) {
        hero.setCurrentWeapon(heroCurrentWeaponToInstantiate);
        return heroCurrentWeaponToInstantiate;
    }

    public Object instantiateHeroCurrentObject(Object heroCurrentObjectToInstantiate) {
        hero.setCurrentObject(heroCurrentObjectToInstantiate);
        return heroCurrentObjectToInstantiate;
    }
}