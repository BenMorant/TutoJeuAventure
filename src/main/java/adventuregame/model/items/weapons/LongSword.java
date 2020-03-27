package adventuregame.model.items.weapons;

public class LongSword extends Weapon {

    public LongSword() {
        super(1, "longue épée", "sword.jpg", "C'est une bien longue épée", 7, 10, 10);

    }

    @Override
    public String toString() {
        return "LongSword{" +
                "damageMax=" + damageMax +
                ", wearMax=" + wearMax +
                ", wear=" + wear +
                ", weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
