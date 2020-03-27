package adventuregame.model.items;

import adventuregame.model.GenericEntity;

public abstract class Item extends GenericEntity {

    protected int weight = 0;

    public Item() {
        super();
    }

    public Item(int gender, String name, String image, String description, int weight) {
        super(gender, name, image, description);
        this.image = "./src/main/resources/pix/" + image;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


