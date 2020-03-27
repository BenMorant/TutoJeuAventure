package adventuregame.model.items.weapons;

public class LongSword extends Weapon {

    public LongSword() {
        super();
        this.gender = 1;
        this.name = "longue épée";
        this.image = "sword.jpg";
        this.description = "C'est une bien longue épée";
        this.weight = 7;
        this.damageMax = 10;
        this.wearMax = 10;
        this.wear = 2;
    }

//    public LongSword() {
//        super(1, "longue épée", "sword.jpg", "C'est une bien longue épée", 7, 10, 10, 2);
//
//    }

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
