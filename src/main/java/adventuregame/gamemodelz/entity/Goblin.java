package adventuregame.gamemodelz.entity;

public class Goblin extends Monster {

    public Goblin() {
        name = "Gobelin";
        hp = 20;
        damageMax = 6;
        attackMessage = "Le gobelin vous touche avec son baton !";
        image = "monsters/goblin.jpg";
        stealDifficulty = 5;
        monsterObject = new Silverring();

    }
}
