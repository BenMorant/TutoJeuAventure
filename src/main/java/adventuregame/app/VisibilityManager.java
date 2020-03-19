package adventuregame.app;

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
        ui.heroPanel.setVisible(false);

        //cache les images

        ui.imageLabelPrincipal.setVisible(false);
        ui.imageLabelPicture.setVisible(false);
    }

    public void titleToTown() {

        //cache l'écran tître
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //montre l'écran du jeu

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.heroPanel.setVisible(true);

        //montre les images

        ui.imageLabelPrincipal.setVisible(true);
        ui.imageLabelPicture.setVisible(true);

    }
}
