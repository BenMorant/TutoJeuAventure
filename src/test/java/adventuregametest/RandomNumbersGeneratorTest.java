package adventuregametest;

import adventuregame.model.items.weapons.Weapon;
import adventuregame.model.utils.ModelHelper;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersGeneratorTest {


    void testMultipleGiveDamageNumberGenerator(int nbTimes, int strengthTest, int strengthMaxTest, int weaponDamageMaxTest) {
        for (int i = 0; i <= nbTimes; i++) {
            testGiveDamageNumberGenerator(strengthTest, strengthMaxTest, weaponDamageMaxTest);
        }
    }

    void testMultipleRandomNumberGenerator(int nbTimes, int min, int max) {
        for (int i = 0; i <= nbTimes; i++) {
            testRandomNumberGenerator(min, max);
        }
    }

    void testRandomNumberGenerator(int min, int max) {
        assertThat(min).as("Minimum number " + min + " should be less than or equal to maximum number " + max).isLessThanOrEqualTo(max);
        int result = ModelHelper.getRandomNumberBetweenTwoBounds(min, max);
        System.out.println("result = " + result);
        assertThat(result).as("result should be between min " + min + " & max " + max).isBetween(min, max);
    }

    void testGiveDamageNumberGenerator(int strengthTest, int strengthMaxTest, int weaponDamageMaxTest) {
        assertThat(strengthTest).as("strength " + strengthTest + " should always be less than or equal to strengthMax " + strengthMaxTest).isLessThanOrEqualTo(strengthMaxTest);
        int result = Weapon.giveDamage(strengthTest, strengthMaxTest, weaponDamageMaxTest);
        System.out.println("result = " + result);
        assertThat(result).as("result " + result + " should be less than or equal to weaponDamageMax " + weaponDamageMaxTest).isLessThanOrEqualTo(weaponDamageMaxTest);
    }

}
