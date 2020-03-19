package adventuregame.business;

import adventuregame.dao.HeroDao;
import adventuregame.dao.WeaponDao;
import adventuregame.entity.Weapon;


public class HeroServiceImpl implements HeroService {

    HeroDao heroDao;
    WeaponDao weaponDao;

    @Override
    public void instantiateAbility(int abilityToConfigure) {
        heroDao.configureAbility(abilityToConfigure);
    }

    @Override
    public void instantiateAbilityMax(int abilityMaxToConfigure) {
        heroDao.configureAbilityMax(abilityMaxToConfigure);
    }

    @Override
    public void instantiateStrength(int strengthToConfigure) {
        heroDao.configureStrength(strengthToConfigure);
    }

    @Override
    public void instantiateStrengthMax(int strengthMaxToConfigure) {
        heroDao.configureStrength(strengthMaxToConfigure);
    }

    @Override
    public void instantiateMp(int mpToConfigure) {
        heroDao.configureMp(mpToConfigure);
    }

    @Override
    public void instantiateMpMax(int mpMaxToConfigure) {
        heroDao.configureMpMax(mpMaxToConfigure);
    }

    @Override
    public void instantiateHp(int hpToConfigure) {
        heroDao.configureHp(hpToConfigure);
    }

    @Override
    public void instantiateHpMax(int hpMaxToConfigure) {
        heroDao.configureHpMax(hpMaxToConfigure);
    }

    @Override
    public void instantiateHeroPicture(String pictureToConfigure) {
        heroDao.configureHeroPicture(pictureToConfigure);
    }

    @Override
    public void instantiateHeroCurrentWeapon(Weapon heroCurrentWeaponToConfigure) {
        weaponDao.configureWearMax(heroCurrentWeaponToConfigure.getWearMax());
        weaponDao.configureWear(heroCurrentWeaponToConfigure.getWear());
        weaponDao.configureWeaponImage(heroCurrentWeaponToConfigure.getImage());
        weaponDao.configureDamageMax(heroCurrentWeaponToConfigure.getDamageMax());

    }
}
