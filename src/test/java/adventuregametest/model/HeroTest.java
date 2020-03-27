package adventuregametest.model;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.people.Hero;
import org.junit.jupiter.api.Test;

class HeroTest {

    Hero heroTest = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?...", new Knife(), null);

    @Test
    void testAllHeroAttributes() {
        System.out.println(heroTest.toString());


    }

    void getHp() {
    }

    @Test
    void setHp() {
    }

    @Test
    void getMp() {
    }

    @Test
    void setMp() {
    }

    @Test
    void getStrength() {
    }

    @Test
    void setStrength() {
    }

    @Test
    void testToString() {
        System.out.println("heroTest.toString() = " + heroTest.toString());
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
    void getHpMax() {
    }

    @Test
    void setHpMax() {
    }

    @Test
    void getMpMax() {
    }

    @Test
    void setMpMax() {
    }

    @Test
    void getAbility() {
    }

    @Test
    void setAbility() {
    }

    @Test
    void getAbilityMax() {
    }

    @Test
    void setAbilityMax() {
    }

    @Test
    void getStrengthMax() {
    }

    @Test
    void setStrengthMax() {
    }

    @Test
    void getCurrentWeapon() {
    }

    @Test
    void setCurrentWeapon() {
    }

    @Test
    void getCurrentItem() {
    }

    @Test
    void setCurrentItem() {
    }
}