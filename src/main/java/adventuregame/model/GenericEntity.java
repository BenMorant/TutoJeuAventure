package adventuregame.model;

public abstract class GenericEntity {

    protected int gender = 0;
    protected String name = null;
    protected String image = null;
    protected String description = null;

    public GenericEntity(int gender, String name, String image, String description) {
        this.gender = gender;
        this.name = name;
        this.image = image;
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
}
