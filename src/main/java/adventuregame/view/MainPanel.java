package adventuregame.view;

import java.awt.*;

public class MainPanel extends MasterPanel {

    private GamePanel mainTextPanel = new GamePanel(40, 650, 750, 550);
    private GameTextArea mainTextArea = new GameTextArea("yo", 40, 650, 750, 350);
    private GamePanel imagePanelMain = new GamePanel(40, 70, 750, 550);
    private GameImageLabel imageLabelMain = new GameImageLabel();
    private GamePanel imagePanelHeroPicture = new GamePanel(960, 70, 140, 175);
    private GameImageLabel imageLabelHeroPicture = new GameImageLabel();
    private GamePanel choiceButtonPanel = new GamePanel(850, 650, 400, 200);
    private GameButton choice1 = new GameButton("choix 1", "c1");
    private GameButton choice2 = new GameButton("choix 2", "c2");
    private GameButton choice3 = new GameButton("choix 3", "c3");
    private GameButton choice4 = new GameButton("choix 4", "c4");
    private GamePanel heroPanel = new GamePanel(850, 260, 400, 320);

    private Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);

    private GameLabel hpLabel = new GameLabel("HP : ", Color.white, heroPanelFont);
    private GameLabel hpLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel hpMaxLabel = new GameLabel("HP Max : ", Color.yellow, heroPanelFont);
    private GameLabel hpMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel weaponLabel = new GameLabel("Arme : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelName = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel weaponLabelDamageMax = new GameLabel("Domage Max : ", Color.orange, heroPanelFont);
    private GameLabel weaponLabelDamageMaxNumber = new GameLabel("", Color.orange, heroPanelFont);
    private GameLabel abilityLabel = new GameLabel("Habileté : ", Color.white, heroPanelFont);
    private GameLabel strengthLabel = new GameLabel("Force : ", Color.white, heroPanelFont);
    private GameLabel mpLabel = new GameLabel("MP : ", Color.lightGray, heroPanelFont);
    private GameLabel mpLabelNumber = new GameLabel("", Color.lightGray, heroPanelFont);
    private GameLabel mpMaxLabel = new GameLabel("MP Max: ", Color.darkGray, heroPanelFont);
    private GameLabel mpMaxLabelNumber = new GameLabel("", Color.darkGray, heroPanelFont);
    private GameLabel strengthLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel abilityLabelNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel strengthMaxLabel = new GameLabel("Force Max : ", Color.yellow, heroPanelFont);
    private GameLabel strengthMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel abilityMaxLabel = new GameLabel("Habileté Max: ", Color.yellow, heroPanelFont);
    private GameLabel abilityMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
    private GameLabel weaponLabelWear = new GameLabel("Usure : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearNumber = new GameLabel("", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearMaxLabel = new GameLabel("Usure Max : ", Color.white, heroPanelFont);
    private GameLabel weaponLabelWearMaxLabelNumber = new GameLabel("", Color.white, heroPanelFont);

    public MainPanel() {
        super();
        mainTextPanel.add(mainTextArea);
        imagePanelMain.add(imageLabelMain);
        imagePanelHeroPicture.add(imageLabelHeroPicture);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        choiceButtonPanel.add(choice1);
        choiceButtonPanel.add(choice2);
        choiceButtonPanel.add(choice3);
        choiceButtonPanel.add(choice4);

        heroPanel.setLayout(new GridLayout(12, 2));
        heroPanel.add(hpLabel);
        heroPanel.add(hpLabelNumber);
        heroPanel.add(hpMaxLabel);
        heroPanel.add(hpMaxLabelNumber);
        heroPanel.add(mpLabel);
        heroPanel.add(mpLabelNumber);
        heroPanel.add(mpMaxLabel);
        heroPanel.add(mpMaxLabelNumber);
        heroPanel.add(weaponLabel);
        heroPanel.add(weaponLabelName);
        heroPanel.add(weaponLabelDamageMax);
        heroPanel.add(weaponLabelDamageMaxNumber);
        heroPanel.add(weaponLabelWear);
        heroPanel.add(weaponLabelWearNumber);
        heroPanel.add(weaponLabelWearMaxLabel);
        heroPanel.add(weaponLabelWearMaxLabelNumber);
        heroPanel.add(strengthLabel);
        heroPanel.add(strengthLabelNumber);
        heroPanel.add(strengthMaxLabel);
        heroPanel.add(strengthMaxLabelNumber);
        heroPanel.add(abilityLabel);
        heroPanel.add(abilityLabelNumber);
        heroPanel.add(abilityMaxLabel);
        heroPanel.add(abilityMaxLabelNumber);
        add(heroPanel);
        add(mainTextPanel);
        add(choiceButtonPanel);
        add(imagePanelHeroPicture);
        add(imagePanelMain);
    }


}
