package adventuregame.gamemodelz.nonplayercharacterz.monsterz;

public class LittleDragon extends SuperMonster {


    public LittleDragon() {
        name = "Petit dragon";
        hp = 60;
        damageMax = 8;
        attackMessage = "Le petit dragon crache un jet de flammes par ses narines !";
        image = "monsters/little_dragon.jpg";
        object = "dent de dragonneau";
        stealDifficulty = 6;

    }
}
