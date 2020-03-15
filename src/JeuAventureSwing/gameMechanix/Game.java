package JeuAventureSwing.gameMechanix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game {

    ChoiceHandler csHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public Game() {

        ui.createUI(csHandler);
        story.defaultSetup();
        vm.showTitleScreen();

    }

    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (yourChoice) {
                case "start":
                    vm.titleToTown();
                    story.townGate();
                    break;
                case "c1":
                    story.selectNextPosition(nextPosition1);
                    break;
                case "c2":
                    story.selectNextPosition(nextPosition2);
                    break;
                case "c3":
                    story.selectNextPosition(nextPosition3);
                    break;
                case "c4":
                    story.selectNextPosition(nextPosition4);
                    break;

            }
        }
    }

    public static int getRandomNumberBetweenTwoBounds(int min, int max) {
            return min + new Random().nextInt(Math.abs(max - min + 1));
    }


    public static void main(String[] args) {

        new Game();

    }
}
