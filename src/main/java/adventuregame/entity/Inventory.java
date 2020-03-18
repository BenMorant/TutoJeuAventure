package adventuregame.entity;

import java.util.List;

public class Inventory {

    private Hero hero;
    private List<Object> objects;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
