package adventuregame.model.places;

import adventuregame.model.GenericEntity;

public abstract class Place extends GenericEntity {


    public Place(int gender, String name, String image, String description) {
        super(gender, name, image, description);
        this.image = "./src/main/resources/pix/places/" + image;
    }

    @Override
    public String toString() {
        return "Place{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
