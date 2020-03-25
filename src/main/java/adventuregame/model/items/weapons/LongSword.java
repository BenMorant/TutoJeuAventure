package adventuregame.model.items.weapons;

public class LongSword extends Weapon {

    public LongSword() {
        super(1, "longue épée", "items/weapons/sword.jpg", "C'est une bien longue épée", 7, 10, 10, 2);

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
