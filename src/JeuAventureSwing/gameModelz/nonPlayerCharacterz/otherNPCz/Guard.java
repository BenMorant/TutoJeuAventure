package JeuAventureSwing.gameModelz.nonPlayerCharacterz.otherNPCz;

import JeuAventureSwing.gameModelz.nonPlayerCharacterz.monsterz.SuperMonster;

public class Guard extends SuperMonster {

    public Guard() {
        name = "Garde";
        aName = "un garde";
        theName = "le garde";
        ofTheName = "du garde";
        hp = 15;
        attack = 3;
        attackMessage = "Le garde vous pique le derrière avec la pointe de son mousquet !";
        image = "monsters/garde.png";

    }
}
