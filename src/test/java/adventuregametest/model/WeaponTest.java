package adventuregametest.model;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.items.weapons.LongSword;
import adventuregame.model.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponTest {

    Weapon couteau = new Knife();
    Weapon epee = new LongSword();


    @Test
    void testWeaponWear(Weapon weaponTest) {
        System.out.println(weaponTest.toString());
        assertThat(weaponTest.getWear()).as("Wear should be between 0 and wearMax-1").isBetween(0, weaponTest.getWearMax() - 1);
    }

}