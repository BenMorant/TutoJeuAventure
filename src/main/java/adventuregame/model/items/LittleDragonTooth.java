package adventuregame.model.items;

public class LittleDragonTooth extends Item {

    public LittleDragonTooth() {
        super(1, "dent de dragonneau", "items/little_dragon_tooth.jpg", "C'est une belle dent de dragonneau", 1);
    }

    @Override
    public String toString() {
        return "LittleDragonTooth{" +
                "weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
