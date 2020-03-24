package adventuregame.model.utils;

import java.util.Random;

public class EntityHelper {

    public static int getRandomNumberBetweenTwoBounds(int min, int max) {
        return min + new Random().nextInt(Math.abs(max - min + 1));
    }
}
