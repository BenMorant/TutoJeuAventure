package adventuregame.gamemodelz.nonplayercharacterz.monsterz;

public class SuperMonster {

    protected String name;
    protected int hp;
    protected int damageMax;
    protected String attackMessage;
    protected String image;
    protected String object;
    protected int stealDifficulty;

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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getStealDifficulty() {
        return stealDifficulty;
    }

    public void setStealDifficulty(int stealDifficulty) {
        this.stealDifficulty = stealDifficulty;
    }
}
