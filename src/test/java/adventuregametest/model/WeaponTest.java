package adventuregametest.model;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.items.weapons.LongSword;
import adventuregame.model.items.weapons.Weapon;
import org.junit.jupiter.api.Test;

class WeaponTest {

    Weapon couteau = new Knife();
    Weapon epee = new LongSword();

    @Test
    void getWeight() {
    }

    @Test
    void setWeight() {
    }

    @Test
    void testToString() {
        System.out.println(couteau.toString());
        System.out.println(epee.toString());

    }

    @Test
    void getGender() {
    }

    @Test
    void setGender() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getImage() {
        System.out.println(couteau.getImage());
    }

    @Test
    void setImage() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
    }

    @Test
    void testToString1() {
    }

    @Test
    void giveDamage() {
    }

    @Test
    void getDamageMax() {
    }

    @Test
    void setDamageMax() {
    }

    @Test
    void getWearMax() {
    }

    @Test
    void setWearMax() {
    }

    @Test
    void getWear() {
    }

    @Test
    void setWear() {
    }
}