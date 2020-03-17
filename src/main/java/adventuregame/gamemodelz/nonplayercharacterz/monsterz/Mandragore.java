package adventuregame.gamemodelz.nonplayercharacterz.monsterz;

public class Mandragore extends SuperMonster {

    public Mandragore() {
        name = "Mandragore";
        hp = 25;
        damageMax = 4;
        attackMessage = "La mandragore pousse son cri mortel !";
        image = "monsters/mandragore.jpg";
        object = "gousse de mandragore";
        stealDifficulty = 3;

    }
}
