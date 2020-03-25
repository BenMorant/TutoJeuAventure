package adventuregame.model.items;

public class SilverRing extends Item {

    public SilverRing() {
        super(2, "anneau d'argent", "silver_ring.jpg", "un anneau d'argent bien convoité...", 1);
    }

    @Override
    public String toString() {
        return "SilverRing{" +
                "weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
