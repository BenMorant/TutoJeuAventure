package adventuregame.front;

import adventuregame.appswing.UI;
import adventuregame.service.HeroService;

public class HeroFront {

    public HeroService heroService = new HeroService();
    public UI ui;

    public int displayHeroHp(int heroHpToDisplay) {
        System.out.println("je suis ici");
        heroService.instantiateHeroHp(heroHpToDisplay);
        System.out.println("je suis là");
        ui.hpLabelNumber.setText("" + heroHpToDisplay);
        return heroHpToDisplay;
    }


}
