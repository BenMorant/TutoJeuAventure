package adventuregame.model.items;

public abstract class Item {

    private String name;
    private String image;
    private int weight;

    public Item(String name, String image, int weight) {
        this.name = name;
        this.image = image;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
