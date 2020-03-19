package adventuregame.dao;

import adventuregame.entity.Weapon;

public class WeaponDaoImpl implements WeaponDao {

    Weapon weapon;
    private int weaponDamageMax, weaponWearMax, weaponWear;
    private String weaponImage;

    @Override
    public void configureDamageMax(int damageMaxToConfigure) {
        weapon.setDamageMax(damageMaxToConfigure);
        weaponDamageMax = weapon.getDamageMax();
    }

    @Override
    public void configureWeaponImage(String imageToConfigure) {
        weapon.setImage(imageToConfigure);
        weaponImage = weapon.getImage();
    }

    @Override
    public void configureWearMax(int wearMaxToConfigure) {
        weapon.setWearMax(wearMaxToConfigure);
        weaponWearMax = weapon.getWearMax();
    }

    @Override
    public void configureWear(int wearToConfigure) {
        weapon.setWear(wearToConfigure);
        weaponWear = weapon.getWear();

    }
}
