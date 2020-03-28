package adventuregametest;

import adventuregame.model.utils.EntityHelper;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersGeneratorTest {

    void testMultipleRandomNumberGenerator(int nbTimes, int min, int max) {
        for (int i = 0; i <= nbTimes; i++) {
            testRandomNumberGenerator(min, max);
        }
    }

    void testRandomNumberGenerator(int min, int max) {
        int result = EntityHelper.getRandomNumberBetweenTwoBounds(min, max);
        System.out.println(result);
        assertThat(result).as("should be between min " + min + " & max " + max).isBetween(min, max);
    }

}
