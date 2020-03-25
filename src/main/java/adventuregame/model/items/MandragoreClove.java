package adventuregame.model.items;

public class MandragoreClove extends Item {

    public MandragoreClove() {
        super(1, "gousse de mandragore", "items/mandragore_clove.jpg", "C'est une bonne gousse de Mandragore", 1);
    }

    @Override
    public String toString() {
        return "MandragoreClove{" +
                "weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
