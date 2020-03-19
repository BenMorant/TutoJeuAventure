package adventuregame.app;

import adventuregame.entity.Goblin;
import adventuregame.entity.Guard;
import adventuregame.entity.Hero;
import adventuregame.entity.Knife;
import adventuregame.entity.LittleDragon;
import adventuregame.entity.LongSword;
import adventuregame.entity.Mandragore;
import adventuregame.entity.Monster;
import adventuregame.entity.Weapon;

import java.util.Random;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Hero hero = new Hero();
    Monster monster;
    private int goThroughTownGate, goThroughTalkGuard, goThroughAttackGuard, goThroughCrossRoad, goThroughNorth, goThroughEast, goThroughWest,
            goThroughFight, goThroughHeroAttack, goThroughMonsterAttack, goThroughGetMonsterObject, goThroughDie, goThroughEnding, goThroughToTitle, goThroughStealMonster;

    private int heroAbility, heroHp, heroHpMax, heroMp, heroMpMax, heroStrength, heroAbilityMax, heroStrengthMax, heroCurrentWeaponDamageMax, heroCurrentWeaponWearMax,
            heroCurrentWeaponWear;
    private String heroPicture, heroCurrentWeaponName;
    private Weapon heroCurrentWeapon;


    public Story(Game g, UI userInterface, VisibilityManager vManager) {

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {
        //picture
        // TODO choose picture
        String heroPicture = "hero/rambo.jpg";
        instantiateHeroPicture(heroPicture);
        //HP Max
        int heroHpMax = Game.getRandomNumberBetweenTwoBounds(7, 15);
        instantiateHpMax(heroHpMax);
        //HP (based on HP max)
        int heroHp = heroHpMax;
        instantiateHp(heroHp);
        //MP Max
        // TODO = 0 for now
        int heroMpMax = Game.getRandomNumberBetweenTwoBounds(0, 0);
        instantiateMpMax(heroMpMax);
        //MP (based on MP max)
        int heroMp = heroMpMax;
        instantiateMp(heroMp);
        //weapon
        //TODO weapon to choose
        Weapon heroWeapon = new Knife();
        instantiateHeroCurrentWeapon(heroWeapon);
        //strength Max
        int heroStrengthMax = Game.getRandomNumberBetweenTwoBounds(0, 10);
        instantiateStrengthMax(heroStrengthMax);
        //strength
        int heroStrength = heroStrengthMax;
        instantiateStrength(heroStrength);
        //ability max
        //TODO : for now...
        int heroAbilityMax = 10 - heroStrengthMax;
        instantiateAbilityMax(heroAbilityMax);
        //ability
        int heroAbility = heroAbilityMax;
        instantiateAbility(heroAbility);

        goThroughTalkGuard = 0;
        goThroughTownGate = 0;
        goThroughAttackGuard = 0;
        goThroughCrossRoad = 0;
        goThroughNorth = 0;
        goThroughEast = 0;
        goThroughWest = 0;
        goThroughFight = 0;
        goThroughHeroAttack = 0;
        goThroughMonsterAttack = 0;
        goThroughGetMonsterObject = 0;
        goThroughDie = 0;
        goThroughEnding = 0;
        goThroughToTitle = 0;
        goThroughStealMonster = 0;
    }

    public void instantiateAbility(int abilityToConfigure) {
        hero.setAbility(abilityToConfigure);
        heroAbility = hero.getAbility();
        ui.abilityLabelNumber.setText("" + heroAbility);
    }

    public void instantiateAbilityMax(int abilityMaxToConfigure) {
        hero.setAbilityMax(abilityMaxToConfigure);
        heroAbilityMax = hero.getAbilityMax();
        ui.abilityMaxLabelNumber.setText("" + heroAbilityMax);
    }

    public void instantiateStrength(int strengthToConfigure) {
        hero.setStrength(strengthToConfigure);
        heroStrength = hero.getStrength();
        ui.strengthLabelNumber.setText("" + heroStrength);
    }

    public void instantiateStrengthMax(int strengthMaxToConfigure) {
        hero.setStrengthMax(strengthMaxToConfigure);
        heroStrengthMax = hero.getStrengthMax();
        ui.strengthMaxLabelNumber.setText("" + heroStrengthMax);
    }

    public void instantiateMp(int mpToConfigure) {
        hero.setMp(mpToConfigure);
        heroMp = hero.getMp();
        ui.mpLabelNumber.setText("" + heroMp);
    }

    public void instantiateMpMax(int mpMaxToConfigure) {
        hero.setMpMax(mpMaxToConfigure);
        heroMpMax = hero.getMpMax();
        ui.mpMaxLabelNumber.setText("" + heroMpMax);
    }

    public void instantiateHp(int hpToConfigure) {
        hero.setHp(hpToConfigure);
        heroHp = hero.getHp();
        ui.hpLabelNumber.setText("" + heroHp);
    }

    public void instantiateHpMax(int hpMaxToConfigure) {
        hero.setHpMax(hpMaxToConfigure);
        heroHpMax = hero.getHpMax();
        ui.hpMaxLabelNumber.setText("" + heroHpMax);
    }

    public void instantiateHeroPicture(String pictureToConfigure) {
        hero.setImage(pictureToConfigure);
        heroPicture = hero.getImage();
        ui.getImage(ui.imageLabelPicture, heroPicture);
    }

    public void instantiateHeroCurrentWeapon(Weapon weaponToConfigure) {
        hero.setCurrentWeapon(weaponToConfigure);
        heroCurrentWeapon = hero.getCurrentWeapon();
        //weapon name
        heroCurrentWeaponName = heroCurrentWeapon.getName();
        ui.weaponLabelName.setText(heroCurrentWeaponName);
        //damage max
        heroCurrentWeaponDamageMax = heroCurrentWeapon.getDamageMax();
        ui.weaponLabelDamageMaxNumber.setText("" + heroCurrentWeaponDamageMax);
        //wear max
        heroCurrentWeaponWearMax = heroCurrentWeapon.getWearMax();
        ui.weaponLabelWearMaxLabelNumber.setText("" + heroCurrentWeapon.getWearMax());
        //wear
        heroCurrentWeapon.setWear(Game.getRandomNumberBetweenTwoBounds(0, heroCurrentWeaponWearMax - 1));
        heroCurrentWeaponWear = heroCurrentWeapon.getWear();
        ui.weaponLabelWearNumber.setText("" + heroCurrentWeapon.getWear());
    }

    public void selectNextPosition(String nextPosition) {

        switch (nextPosition) {
            case "townGate":
                townGate();
                goThroughTownGate++;
                break;
            case "talkGuard":
                talkGuard();
                goThroughTalkGuard++;
                break;
            case "attackGuard":
                attackGuard();
                goThroughAttackGuard++;
                break;
            case "crossRoad":
                crossRoad();
                goThroughCrossRoad++;
                break;
            case "north":
                north();
                goThroughNorth++;
                break;
            case "east":
                east();
                goThroughEast++;
                break;
            case "west":
                west();
                goThroughWest++;
                break;
            case "fight":
                fight();
                goThroughFight++;
                break;
            case "heroAttack":
                heroAttack();
                goThroughHeroAttack++;
                break;
            case "stealMonster":
                stealMonster();
                goThroughStealMonster++;
                break;
            case "monsterAttack":
                monsterAttack();
                goThroughMonsterAttack++;
                break;
            case "getMonsterObject":
                goThroughGetMonsterObject++;
                getMonsterObject();
                break;
            case "die":
                die();
                goThroughDie++;
                break;
            case "ending":
                ending();
                goThroughEnding++;
                break;
            case "toTitle":
                toTitle();
                goThroughToTitle++;
                break;
        }
    }

    public void townGate() {
        ui.getImage(ui.imageLabelPrincipal, "places//town.jpg");
        System.out.println(heroHp);
        ui.mainTextArea.setText("Vous êtes aux portes de la Cité. \n Un garde se tient debout devant vous. \n Que voulez vous faire ? \n \n \n ");
        ui.choice1.setText("Parler au garde");
        ui.choice2.setText("Attaquer le garde");
        ui.choice3.setText("Partir de là");
        ui.choice4.setText("");

        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    public void talkGuard() {
        monster = new Guard();
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
//        if (hero.getCurrentObject().equals(new Silverring())) {
//            ending();
//        } else {
        if (goThroughTalkGuard == 0) {
            ui.mainTextArea.setText(monster.getName() + " a l'air affable et poli au premier abord, mais vous sentez aussi qu'il peut être facilement irrascible si on lui tient la jambe trop longtemps...\n" + monster.getName() + ": \" Bien le bonjour, étranger !\n Je ne vous ai jamais vu. \n Je suis désolé mais nous ne pouvons pas laisser entrer un étranger dans notre valeureuse Cité. \"");
        } else if (goThroughTalkGuard == 1 || goThroughTalkGuard == 4) {
            ui.mainTextArea.setText(monster.getName() + ": \" Dégagez de là. Allez, Oust, circulez y'a rien à voir !\"");
        } else if (goThroughTalkGuard == 2) {
            ui.mainTextArea.setText("Vous entendez " + monster.getName() + " grommeler entre ses dents : \" Bon, c'est vrai qu'il me le faudrait, ce petit anneau ! \"");
        } else if (goThroughTalkGuard == 3) {
            if (heroAbility > 5) {
                ui.mainTextArea.setText("Vous tendez l'oreille et grâce à vos points d'habilité vous percevez les murmures " + monster.getName() + " : \" Je crois savoir que c'est un Gobelin a l'Ouest qui en serait l'heureux propriétaire... \n Je donnerais tout pour l'avoir ! \"");
            } else {
                    ui.mainTextArea.setText("Vous avez beau tendre l'oreille, vous n'avez pas assez de points d'habilité pour percevoir les murmures " + monster.getName());
                }
            } else {
                ui.mainTextArea.setText(monster.getName() + ": \" Toi, tu commences sérieusement à me chauffer les oreilles. Attends de voir un peu de quel bois je me chauffe ! \"");

            }
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            if (goThroughTalkGuard == 2) {
                game.nextPosition1 = "talkGuard";
            } else if (goThroughTalkGuard > 4) {
                game.nextPosition1 = "attackGuard";
            } else {
                game.nextPosition1 = "townGate";
            }
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    //  }

    public void attackGuard() {
        monster = new Guard();
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
        int dammageGuard = Game.getRandomNumberBetweenTwoBounds(2, 4);
        if (goThroughAttackGuard == 0) {
            ui.mainTextArea.setText(monster.getName() + " : \"Hey ! Ne sois pas stupide!\" \n Vous vous battez bravement mais " + monster.getName() + " vous frappe fort \net vous recevez " + dammageGuard + " points de dommage");
        } else {
            dammageGuard++;
            ui.mainTextArea.setText(monster.getName() + " : \"Toi, tu n'as rien compris à la leçon que je t'ai donnée tout à l'heure !\" \n " + monster.getName() + " vous frappe encore plus fort \net vous recevez " + dammageGuard + " points de dommage");
        }
        instantiateHp(heroHp - dammageGuard);
        if (heroHp < 1) {
            instantiateHp(0);
            game.nextPosition1 = "die";
        } else {
            game.nextPosition1 = "townGate";
        }
        ui.hpLabelNumber.setText("" + heroHp);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void crossRoad() {
        ui.getImage(ui.imageLabelPrincipal, "places/crossroad.jpg");
        ui.mainTextArea.setText("Vous êtes à un carrefour. \nSi vous allez au sud, vous serez de retour aux portes de la Cité. \n  Vous choisissez d'aller :");
        ui.choice1.setText("au Nord");
        ui.choice2.setText("à l'Est");
        ui.choice3.setText("au Sud");
        ui.choice4.setText("à l'Ouest");

        game.nextPosition1 = "north";
        game.nextPosition2 = "east";
        game.nextPosition3 = "townGate";
        game.nextPosition4 = "west";
    }

    public void north() {
        ui.getImage(ui.imageLabelPrincipal, "places/river.jpeg");
        int riverRestore = Game.getRandomNumberBetweenTwoBounds(1, 3);
        if (goThroughNorth < 2) {
            if (heroHp < (heroHpMax - 1)) {
                instantiateHp(heroHp + riverRestore);
                ui.hpLabelNumber.setText("" + heroHp);
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+" + riverRestore + ")");
            } else if (heroHp < heroHpMax) {
                instantiateHp(heroHp + 1);
                ui.hpLabelNumber.setText("" + heroHp);
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+1)");
            } else {
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont au maximum.");
            }
        } else {
            if (heroAbility > 0) {
                instantiateAbility(heroAbility--);
                ui.abilityLabelNumber.setText("" + heroAbility);
                ui.mainTextArea.setText("Vous avez trop bu d'eau et perdez un point d'habileté.");
            } else {
                ui.mainTextArea.setText("Vous avez trop bu d'eau.");
            }
        }

        ui.choice1.setText("Vous allez au Sud");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void east() {
        Weapon swordFound = new LongSword();
        ui.getImage(ui.imageLabelPrincipal, swordFound.getImage());
        if (heroStrength < 5) {
            ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n Malheureusement, vous n'êtes pas assez fort pour la porter.");
        } else {
            instantiateHeroCurrentWeapon(swordFound);
            ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n ( dommage max = " + heroCurrentWeaponDamageMax + " , usure = " + heroCurrentWeaponWear + " / " + heroCurrentWeaponWearMax + " )");
            if (heroCurrentWeaponWear == heroCurrentWeaponWearMax) {
                ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n ( dommage max = " + heroCurrentWeaponDamageMax + " , usure = " + heroCurrentWeaponWear + " / " + heroCurrentWeaponWearMax +
                        " ) \n ... Vous comprenez pourquoi " + heroCurrentWeaponName + "a été jeté.");
            }
        }

        ui.choice1.setText("Vous allez à l'Ouest");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void west() {
        int i = new Random().nextInt(100) + 1;

        if (i < 60) {
            monster = new Goblin();
        } else if (i < 90) {
            monster = new Mandragore();
        } else {
            monster = new LittleDragon();
        }
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
        ui.mainTextArea.setText("Vous tombez nez à nez sur " + monster.getName() + " !");
        ui.choice1.setText("Vous combattez");
        ui.choice2.setText("Vous fuyez");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fight() {
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
        if (heroAbility > 4) {
            ui.mainTextArea.setText("Grâce à vos points d'habilité, vous arrivez à déterminer les HP " + monster.getName() + " : " + monster.getHp() + "HP .\n\nQue faîtes vous ?");
            ui.choice1.setText("Vous attaquez");
        } else {
            ui.mainTextArea.setText("Malheureusement, vous n'arrivez pas à déterminer les HP " + monster.getName() + "\n\nQue faîtes vous ?");
            ui.choice1.setText("Vous attaquez malgré cela");
        }

        ui.choice2.setText("Vous tentez de voler " + monster.getName());
        ui.choice3.setText("Vous fuyez");
        ui.choice4.setText("");

        game.nextPosition1 = "heroAttack";
        game.nextPosition2 = "stealMonster";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    public void heroAttack() {
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
        int heroDamage = Weapon.getDamageWeapon(heroStrength, heroStrengthMax, heroCurrentWeaponDamageMax);

        monster.setHp(monster.getHp() - heroDamage);

        if (heroCurrentWeaponWear < heroCurrentWeaponWearMax && (goThroughHeroAttack != 0 && goThroughHeroAttack % 2 == 0)) {
            heroCurrentWeapon.setWear(heroCurrentWeaponWear++);
            ui.weaponLabelWearNumber.setText("" + heroCurrentWeaponWear);
        }
        if (heroAbility > 4) {
            ui.mainTextArea.setText("Vous attaquez " + monster.getName() + " et lui donnez " + heroDamage + " de dommage ! \n" + monster.getName() + " a désormais " + monster.getHp() + " HP.");
        } else {
            ui.mainTextArea.setText("Vous attaquez " + monster.getName() + " et lui donnez " + heroDamage + " de dommage !");
        }

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (monster.getHp() < 1) {
            monster.setHp(0);
            ui.mainTextArea.setText("Vous attaquez " + monster.getName() + " et lui donnez " + heroDamage + " de dommage ! \n" + monster.getName() + " est mort .");
            if (monster.getName().equalsIgnoreCase("gobelin")) {
                game.nextPosition1 = "getSilverRing";
            } else {
                game.nextPosition1 = "crossRoad";
            }
        } else {
            game.nextPosition1 = "monsterAttack";
        }
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void stealMonster() {
        boolean alreadyStolen = false;
        int chance = Game.getRandomNumberBetweenTwoBounds(0, heroAbility);
        if (chance < monster.getStealDifficulty()) {
            ui.mainTextArea.setText("Vous n'avez pas réussi à voler " + monster.getName() + " !");
        } else {
            ui.mainTextArea.setText("Bravo ! Vous avez réussi à choper " + monster.getMonsterObject().name);
            hero.setCurrentObject(monster.getMonsterObject());
            alreadyStolen = true;
        }
        if (alreadyStolen) {
            ui.mainTextArea.setText("Bravo ! Vous avez déjà volé " + monster.getName());
            game.nextPosition1 = "heroAttack";
        } else {
            game.nextPosition1 = "monsterAttack";
        }

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void monsterAttack() {
        ui.getImage(ui.imageLabelPrincipal, monster.getImage());
        int monsterDamage = Game.getRandomNumberBetweenTwoBounds(1, monster.getDamageMax());

        instantiateHp(heroHp - monsterDamage);
        if (heroHp < 1) {
            instantiateHp(0);
        }
        ui.hpLabelNumber.setText("" + heroHp);

        ui.mainTextArea.setText(monster.getAttackMessage() + "\n " + monster.getName() + " vous attaque et vous donne " + monsterDamage + " de dommage!");

        ui.choice3.setText("");
        ui.choice4.setText("");

        if (heroHp < 1) {
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            game.nextPosition1 = "die";
            game.nextPosition2 = "";
            game.nextPosition2 = "";
        } else {
            ui.choice1.setText("Vous attaquez");
            ui.choice2.setText("Vous tentez de voler " + monster.getName());
            ui.choice3.setText("Vous fuyez");
            game.nextPosition1 = "heroAttack";
            game.nextPosition2 = "stealMonster";
            game.nextPosition3 = "crossRoad";
        }

        ui.choice4.setText("");
        game.nextPosition4 = "";
    }

    public void getMonsterObject() {

        ui.getImage(ui.imageLabelPrincipal, "objects/silver_ring.jpg");
        ui.mainTextArea.setText("Vous avez battu " + monster.getName() + " !\n" + monster.getName() + " a laché un anneau!\n\n(Vous obtenez un Anneau d'argent)");

        ui.choice1.setText("Vous allez à l'Est");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void die() {
        ui.getImage(ui.imageLabelPrincipal, "");

        ui.mainTextArea.setText("Vous êtes mort !\n\n GAME OVER");

        ui.choice1.setText("Revenir à l'écran tître");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void ending() {
        ui.getImage(ui.imageLabelPrincipal, "garde.jpg");
        ui.mainTextArea.setText("Garde: \"Oh vous avez tué " + monster.getName() + " !!??? Super !\nVous êtes notre heros!\nBienvenue dans notre Cité!\"\n\nTHE END");

        ui.choice1.setText("Revenir à l'écran tître");

        game.nextPosition1 = "toTitle";
    }

    public void toTitle() {

        defaultSetup();
        vm.showTitleScreen();
    }
}
