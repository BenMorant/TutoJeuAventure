package adventuregametest.model;

import adventuregame.model.items.weapons.Knife;
import adventuregame.model.items.weapons.Weapon;
import adventuregame.model.people.Hero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HeroTest {

    Weapon heroKnifeStart = new Knife();
    Hero heroTest = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?...", heroKnifeStart, null);

    @Test
    @DisplayName("test for every Hero attribute at the beginning of the game")
    void testAllHeroAttributes() {
        System.out.println(heroTest.toString());
        assertThat(heroTest.getHp()).as("Hp should be equal to HpMax").isEqualTo(heroTest.getHpMax());
        assertThat(heroTest.getMp()).as("Mp should be equal to MpMax").isEqualTo(heroTest.getMpMax());
        assertThat(heroTest.getHpMax()).as("HpMax should be between 7 and 15").isBetween(7, 15);
        assertThat(heroTest.getMpMax()).as("MpMax should be between 0 and 0").isBetween(0, 0);
        assertThat(heroTest.getAbility()).as("ability should be equal to abilityMax").isEqualTo(heroTest.getAbilityMax());
        assertThat(heroTest.getAbilityMax()).as("abilityMax should be equal to 10-strengthMax").isEqualTo(10 - heroTest.getStrengthMax());
        assertThat(heroTest.getStrength()).as("strength should be equal to strengthMax").isEqualTo(heroTest.getStrengthMax());
        assertThat(heroTest.getStrengthMax()).as("strengthMax should be between 0 and 10").isBetween(0, 10);
        assertThat(heroTest.getCurrentWeapon()).as("currentWeapon should be Knife").isEqualTo(heroKnifeStart);
        //test currentweapon here
        assertThat(heroTest.getCurrentItem()).as("currentItem should be null").isEqualTo((null));
        assertThat(heroTest.getImage()).as("image should begin with ./src/main/resources/pix/items/hero/").startsWith("./src/main/resources/pix/items/hero/");
    }
}