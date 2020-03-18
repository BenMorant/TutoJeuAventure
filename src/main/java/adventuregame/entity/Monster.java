package adventuregame.entity;

public class Monster {

    protected String name;
    protected int hp;
    protected int damageMax;
    protected String attackMessage;
    protected String image;
    protected int stealDifficulty;
    protected Object monsterObject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public String getAttackMessage() {
        return attackMessage;
    }

    public void setAttackMessage(String attackMessage) {
        this.attackMessage = attackMessage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStealDifficulty() {
        return stealDifficulty;
    }

    public void setStealDifficulty(int stealDifficulty) {
        this.stealDifficulty = stealDifficulty;
    }

    public Object getMonsterObject() {
        return monsterObject;
    }

    public void setMonsterObject(Object monsterObject) {
        this.monsterObject = monsterObject;
    }
}
