package adventuregametest.model;

import adventuregame.model.items.weapons.Weapon;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponTest {
    
    void testWeaponWear(Weapon weaponTest) {
        System.out.println(weaponTest.toString());
        assertThat(weaponTest.getWear()).as("Wear " + weaponTest.getWear() + "should be between 0 and wearMax-1").isBetween(0, weaponTest.getWearMax() - 1);
    }

}