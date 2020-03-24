package adventuregame.model.people.monsters;

import adventuregame.model.items.MandragoreClove;

public class Mandragore extends Monster {
    public Mandragore() {
        super(1, "Mandragore", "people/monsters/mandragore.jpg", "une mandragore qui a l'air inoffensif...", 25, 0, 4, "La Mandragore pousse son cri mortel !", 3, new MandragoreClove());
    }
}
