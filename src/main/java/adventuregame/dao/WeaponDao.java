package adventuregame.dao;

public interface WeaponDao {

    void configureDamageMax(int damageMaxToConfigure);

    void configureWeaponImage(String imageToConfigure);

    void configureWearMax(int wearMaxToConfigure);

    void configureWear(int wearToConfigure);
}
