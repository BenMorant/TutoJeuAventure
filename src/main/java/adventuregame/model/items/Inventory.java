package adventuregame.model.items;

import adventuregame.model.GenericModel;

import java.util.List;

public abstract class Inventory extends GenericModel {

    protected List<Item> Items = null;
    protected int capacity = 0;

    public Inventory(int gender, String name, String image, String description, List<Item> items, int capacity) {
        super(gender, name, image, description);
        Items = items;
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "Items=" + Items +
                ", capacity=" + capacity +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
