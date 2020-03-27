package adventuregame.model.items.weapons;

import adventuregame.model.utils.EntityHelper;

public class Knife extends Weapon {

//    public Knife() {
//
//        this.gender = 2;
//        this.damageMax = 5;
//        this.wear = 2;
//        this.name = "couteau";
//        this.image = "knife.jpg";
//        this.weight = 3;
//        this.wearMax = 5;
//        this.description = "un petit couteau de cuisine";
//    }

    public Knife() {
        super(2, "couteau", "knife.jpg", "un petit couteau de cuisine", 3, 5, 5, 0);
        this.wear = EntityHelper.getRandomNumberBetweenTwoBounds(0, wearMax);
    }

    @Override
    public String toString() {
        return "Knife{" +
                "damageMax=" + damageMax +
                ", wearMax=" + wearMax +
                ", wear=" + wear +
                ", weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
