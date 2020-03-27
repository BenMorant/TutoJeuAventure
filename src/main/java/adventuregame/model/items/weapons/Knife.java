package adventuregame.model.items.weapons;

public class Knife extends Weapon {

    public Knife() {
        super(2, "couteau", "knife.jpg", "un petit couteau de cuisine", 3, 5, 5);
    }

    @Override
    public String toString() {
        return "Knife{" +
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
