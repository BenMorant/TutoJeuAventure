package adventuregame.model.people.monsters;

public class Guard extends Monster {
    public Guard() {
        super(2, "Garde", "people/monsters/guard.png", "un garde qui n'a pas l'air affable...", 15, 0, 3, "Le garde vous pique le derrière avec la pointe de son mousquet !", 10, null);
    }

    @Override
    public String toString() {
        return "Guard{" +
                "attackMessage='" + attackMessage + '\'' +
                ", stealDifficulty=" + stealDifficulty +
                ", monsterItem=" + monsterItem +
                ", hp=" + hp +
                ", mp=" + mp +
                ", strength=" + strength +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
