package adventuregame.model;

public abstract class GenericModel {

    protected int gender = 0;
    protected String name = null;
    protected String image = null;
    protected String description = null;

    public GenericModel() {

    }

    public GenericModel(int gender, String name, String image, String description) {
        this.gender = gender;
        this.name = name;
        this.image = "./src/main/resources/pix/" + image;
        this.description = description;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO : check if it's the good path (maybe it's 2 "/" ...
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GenericEntity{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
