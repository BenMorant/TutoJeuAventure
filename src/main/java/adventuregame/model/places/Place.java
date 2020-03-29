package adventuregame.model.places;

import adventuregame.model.GenericModel;

public abstract class Place extends GenericModel {


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
