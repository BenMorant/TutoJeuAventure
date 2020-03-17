package adventuregame.gamemodelz.nonplayercharacterz.monsterz;

public class Goblin extends SuperMonster {

    public Goblin() {
        name = "Gobelin";
        hp = 20;
        damageMax = 6;
        attackMessage = "Le gobelin vous touche avec son baton !";
        image = "monsters/goblin.jpg";
        object = "annnnneau !";
        stealDifficulty = 5;

        //monsterObject = new Silverring();

    }
}
