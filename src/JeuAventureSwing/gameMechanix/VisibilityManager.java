package JeuAventureSwing.gameMechanix;

public class VisibilityManager {
    UI ui;

    public VisibilityManager(UI userInterface) {

        ui = userInterface;

    }

    public void showTitleScreen() {

        //montre l'écran tître
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //cache l'écran du jeu

        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);

        //cache les images

        ui.imageLabelPrincipal.setVisible(false);
        ui.imageLabelPortrait.setVisible(false);
    }

    public void titleToTown() {

        //cache l'écran tître
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //montre l'écran du jeu

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

        //montre les images

        ui.imageLabelPrincipal.setVisible(true);
        ui.imageLabelPortrait.setVisible(true);

    }
}
