package adventuregame.model.people.monsters;

public class Guard extends Monster {

    public Guard() {
        name = "Garde";
        hp = 15;
        damageMax = 3;
        attackMessage = "Le garde vous pique le derrière avec la pointe de son mousquet !";
        image = "monsters/guard.png";

    }
}
