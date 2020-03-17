package adventuregame.gamemechanix;

import adventuregame.gamemodelz.entity.Hero;
import adventuregame.gamemodelz.nonplayercharacterz.monsterz.Goblin;
import adventuregame.gamemodelz.nonplayercharacterz.monsterz.LittleDragon;
import adventuregame.gamemodelz.nonplayercharacterz.monsterz.Mandragore;
import adventuregame.gamemodelz.nonplayercharacterz.monsterz.SuperMonster;
import adventuregame.gamemodelz.nonplayercharacterz.othernpcz.Guard;
import adventuregame.gamemodelz.weaponz.Knife;
import adventuregame.gamemodelz.weaponz.LongSword;
import adventuregame.gamemodelz.weaponz.SuperWeapon;

import java.util.Random;

import static adventuregame.gamemechanix.Game.getRandomNumberBetweenTwoBounds;
import static adventuregame.gamemodelz.weaponz.SuperWeapon.getDamageWeapon;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Hero hero = new Hero();
    SuperMonster monster;
    boolean hasSilverRing;
    int goThroughTownGate, goThroughTalkGuard, goThroughAttackGuard, goThroughCrossRoad, goThroughNorth, goThroughEast, goThroughWest,
            goThroughFight, goThroughHeroAttack, goThroughMonsterAttack, goThroughGetSilverRing, goThroughDie, goThroughEnding, goThroughToTitle, goThroughStealEnemy;


    private int heroAbility = hero.getAbility();
    private int heroHp = hero.getHp();
    private int heroHpMax = hero.getHpMax();
    private int heroMp = hero.getMp();
    private int heroMpMax = hero.getMpMax();
    private int heroStrength = hero.getStrength();
    private int heroAbilityMax = hero.getAbilityMax();
    private int heroStrengthMax = hero.getStrengthMax();
    private String heroPicture = hero.getPicture();
    private SuperWeapon heroCurrentWeapon = hero.getCurrentWeapon();


    public Story(Game g, UI userInterface, VisibilityManager vManager) {

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {

        ui.getImage(ui.imageLabelPicture, heroPicture);
        hero.setHpMax(getRandomNumberBetweenTwoBounds(7, 15));
        hero.setHp(heroHpMax);

        ui.hpLabelNumber.setText("" + heroHp);
        ui.hpMaxLabelNumber.setText("" + heroHpMax);

        hero.setMpMax(0);
        hero.setMp(heroMpMax);

        ui.mpLabelNumber.setText("" + heroMp);
        ui.mpMaxLabelNumber.setText("" + heroMpMax);

        hero.setCurrentWeapon(new Knife());
        ui.weaponLabelName.setText(heroCurrentWeapon.name);
        ui.weaponLabelDamageMaxNumber.setText("" + heroCurrentWeapon.damageMax);

        heroCurrentWeapon.wear = getRandomNumberBetweenTwoBounds(0, heroCurrentWeapon.wearMax - 1);
        ui.weaponLabelWearNumber.setText("" + heroCurrentWeapon.wear);
        ui.weaponLabelWearMaxLabelNumber.setText("" + heroCurrentWeapon.wearMax);

        hero.setStrengthMax(getRandomNumberBetweenTwoBounds(0, 10));
        hero.setStrength(heroStrengthMax);
        hero.setAbilityMax(10 - heroStrengthMax);
        hero.setAbility(heroAbilityMax);
        ui.strengthLabelNumber.setText("" + heroStrength);
        ui.strengthMaxLabelNumber.setText("" + heroStrengthMax);
        ui.abilityLabelNumber.setText("" + heroAbility);
        ui.abilityMaxLabelNumber.setText("" + heroAbilityMax);

        hasSilverRing = false;
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
        goThroughGetSilverRing = 0;
        goThroughDie = 0;
        goThroughEnding = 0;
        goThroughToTitle = 0;
        goThroughStealEnemy = 0;
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
            case "stealEnemy":
                stealEnemy();
                goThroughStealEnemy++;
                break;
            case "monsterAttack":
                monsterAttack();
                goThroughMonsterAttack++;
                break;
            case "getSilverRing":
                goThroughGetSilverRing++;
                getSilverRing();
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
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        if (!hasSilverRing) {
            if (goThroughTalkGuard == 0) {
                ui.mainTextArea.setText(monster.name + " a l'air affable et poli au premier abord, mais vous sentez aussi qu'il peut être facilement irrascible si on lui tient la jambe trop longtemps...\n" + monster.name + ": \" Bien le bonjour, étranger !\n Je ne vous ai jamais vu. \n Je suis désolé mais nous ne pouvons pas laisser entrer un étranger dans notre valeureuse Cité. \"");
            } else if (goThroughTalkGuard == 1 || goThroughTalkGuard == 4) {
                ui.mainTextArea.setText(monster.name + ": \" Dégagez de là. Allez, Oust, circulez y'a rien à voir !\"");
            } else if (goThroughTalkGuard == 2) {
                ui.mainTextArea.setText("Vous entendez " + monster.name + " grommeler entre ses dents : \" Bon, c'est vrai qu'il me le faudrait, ce petit anneau ! \"");
            } else if (goThroughTalkGuard == 3) {
                if (heroAbility > 5) {
                    ui.mainTextArea.setText("Vous tendez l'oreille et grâce à vos points d'habilité vous percevez les murmures " + monster.name + " : \" Je crois savoir que c'est un Gobelin a l'Ouest qui en serait l'heureux propriétaire... \n Je donnerais tout pour l'avoir ! \"");
                } else {
                    ui.mainTextArea.setText("Vous avez beau tendre l'oreille, vous n'avez pas assez de points d'habilité pour percevoir les murmures " + monster.name);
                }
            } else {
                ui.mainTextArea.setText(monster.name + ": \" Toi, tu commences sérieusement à me chauffer les oreilles. Attends de voir un peu de quel bois je me chauffe ! \"");

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
        } else if (hasSilverRing) {
            ending();
        }
    }

    public void attackGuard() {
        monster = new Guard();
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int dammageGuard = getRandomNumberBetweenTwoBounds(2, 4);
        if (goThroughAttackGuard == 0) {
            ui.mainTextArea.setText(monster.name + " : \"Hey ! Ne sois pas stupide!\" \n Vous vous battez bravement mais " + monster.name + " vous frappe fort \net vous recevez " + dammageGuard + " points de dommage");
        } else {
            dammageGuard++;
            ui.mainTextArea.setText(monster.name + " : \"Toi, tu n'as rien compris à la leçon que je t'ai donnée tout à l'heure !\" \n " + monster.name + " vous frappe encore plus fort \net vous recevez " + dammageGuard + " points de dommage");
        }
        hero.setHp(heroHp - dammageGuard);

        if (heroHp < 1) {
            hero.setHp(0);
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
        int riverRestore = getRandomNumberBetweenTwoBounds(1, 3);
        if (goThroughNorth < 2) {
            if (heroHp < (heroHpMax - 1)) {
                hero.setHp(heroHp + riverRestore);
                ui.hpLabelNumber.setText("" + heroHp);
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+" + riverRestore + ")");
            } else if (heroHp < heroHpMax) {
                hero.setHp(heroHp + 1);
                ui.hpLabelNumber.setText("" + heroHp);
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont restaurés (+1)");
            } else {
                ui.mainTextArea.setText("Il y a une rivière. Vous buvez de l'eau et vous vous reposez sur la rive. \n Vos points de vie sont au maximum.");
            }
        } else {
            if (heroAbility > 0) {
                hero.setAbility(heroAbility--);
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
        SuperWeapon swordFound = new LongSword();
        ui.getImage(ui.imageLabelPrincipal, swordFound.image);
        if (heroStrength < 5) {
            ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n Malheureusement, vous n'êtes pas assez fort pour la porter.");
        } else {
            hero.setCurrentWeapon(swordFound);
            ui.weaponLabelName.setText(hero.getCurrentWeapon().name);
            ui.weaponLabelDamageMaxNumber.setText("" + hero.getCurrentWeapon().damageMax);
            hero.getCurrentWeapon().wear = getRandomNumberBetweenTwoBounds(0, hero.getCurrentWeapon().wearMax - 1);
            ui.weaponLabelWearNumber.setText("" + hero.getCurrentWeapon().wear);
            ui.weaponLabelWearMaxLabelNumber.setText("" + hero.getCurrentWeapon().wearMax);
            ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n ( dommage max = " + hero.getCurrentWeapon().damageMax + " , usure = " + hero.getCurrentWeapon().wear + " / " + hero.getCurrentWeapon().wearMax + " )");
            if (hero.getCurrentWeapon().wear == hero.getCurrentWeapon().wearMax) {
                ui.mainTextArea.setText("Vous arrivez en plein coeur d'une forêt et trouvez une longue épée. \n ( dommage max = " + hero.getCurrentWeapon().damageMax + " , usure = " + hero.getCurrentWeapon().wear + " / " + hero.getCurrentWeapon().wearMax +
                        " ) \n ... Vous comprenez pourquoi " + hero.getCurrentWeapon().name + "a été jeté.");
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
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        ui.mainTextArea.setText("Vous tombez nez à nez sur " + monster.name + " !");
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
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        if (heroAbility > 4) {
            ui.mainTextArea.setText("Grâce à vos points d'habilité, vous arrivez à déterminer les HP " + monster.name + " : " + monster.hp + "HP .\n\nQue faîtes vous ?");
            ui.choice1.setText("Vous attaquez");
        } else {
            ui.mainTextArea.setText("Malheureusement, vous n'arrivez pas à déterminer les HP " + monster.name + "\n\nQue faîtes vous ?");
            ui.choice1.setText("Vous attaquez malgré cela");
        }

        ui.choice2.setText("Vous tentez de voler " + monster.name);
        ui.choice3.setText("Vous fuyez");
        ui.choice4.setText("");

        game.nextPosition1 = "heroAttack";
        game.nextPosition2 = "stealEnemy";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    public void heroAttack() {
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int heroDamage = getDamageWeapon(heroStrength, heroStrengthMax, heroCurrentWeapon.damageMax);

        monster.hp = monster.hp - heroDamage;

        if (heroCurrentWeapon.wear < heroCurrentWeapon.wearMax && (goThroughHeroAttack != 0 && goThroughHeroAttack % 2 == 0)) {
            heroCurrentWeapon.wear++;
            ui.weaponLabelWearNumber.setText("" + heroCurrentWeapon.wear);
        }
        if (heroAbility > 4) {
            ui.mainTextArea.setText("Vous attaquez " + monster.name + " et lui donnez " + heroDamage + " de dommage ! \n" + monster.name + " a désormais " + monster.hp + " HP.");
        } else {
            ui.mainTextArea.setText("Vous attaquez " + monster.name + " et lui donnez " + heroDamage + " de dommage !");
        }

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (monster.hp < 1) {
            monster.hp = 0;
            ui.mainTextArea.setText("Vous attaquez " + monster.name + " et lui donnez " + heroDamage + " de dommage ! \n" + monster.name + " est mort .");
            if (monster.name.equalsIgnoreCase("gobelin")) {
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

    public void stealEnemy() {
        boolean alreadyStolen = false;
        int chance = getRandomNumberBetweenTwoBounds(0, heroAbility);
        if (chance < monster.stealDifficulty) {
            ui.mainTextArea.setText("Vous n'avez pas réussi à voler l'ennemi !");
        } else {
            ui.mainTextArea.setText("Bravo ! Vous avez réussi à choper " + monster.object);
            alreadyStolen = true;
        }
        if (alreadyStolen) {
            ui.mainTextArea.setText("Bravo ! Vous avez déjà volé " + monster.name);
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
        ui.getImage(ui.imageLabelPrincipal, monster.image);
        int monsterDamage = getRandomNumberBetweenTwoBounds(1, monster.damageMax);

        hero.setHp(heroHp - monsterDamage);
        if (heroHp < 1) {
            hero.setHp(0);
        }
        ui.hpLabelNumber.setText("" + heroHp);

        ui.mainTextArea.setText(monster.attackMessage + "\n " + monster.name + " vous attaque et vous donne " + monsterDamage + " de dommage!");


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
            ui.choice2.setText("Vous tentez de voler " + monster.name);
            ui.choice3.setText("Vous fuyez");
            game.nextPosition1 = "heroAttack";
            game.nextPosition2 = "stealEnemy";
            game.nextPosition3 = "crossRoad";
        }

        ui.choice4.setText("");
        game.nextPosition4 = "";
    }

    public void getSilverRing() {

        ui.getImage(ui.imageLabelPrincipal, "objects/silver_ring.jpg");
        hasSilverRing = true;
        ui.mainTextArea.setText("Vous avez battu " + monster.name + " !\n" + monster.name + " a laché un anneau!\n\n(Vous obtenez un Anneau d'argent)");

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
        ui.mainTextArea.setText("Garde: \"Oh vous avez tué " + monster.name + " !!??? Super !\nVous êtes notre heros!\nBienvenue dans notre Cité!\"\n\nTHE END");

        ui.choice1.setText("Revenir à l'écran tître");

        game.nextPosition1 = "toTitle";
    }

    public void toTitle() {

        defaultSetup();
        vm.showTitleScreen();
    }
}
