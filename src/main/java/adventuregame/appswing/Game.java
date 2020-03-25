//package adventuregame.appswing;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Game {
//
//    ChoiceHandler csHandler = new ChoiceHandler();
//    UI ui = new UI();
//    VisibilityManager vm = new VisibilityManager(ui);
//    Story story = new Story(ui, vm);
//    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
//
//    public Game() {
//
//        ui.createUI(csHandler);
//        vm.showTitleScreen();
//        story.defaultHeroSetup();
//
//
//    }
//
//
//    public class ChoiceHandler implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent event) {
//
//            String yourChoice = event.getActionCommand();
//
//            switch (yourChoice) {
//                case "start":
//                    vm.titleToTown();
//                    story.townGate();
//                    break;
//                case "c1":
//                    story.selectNextPosition(nextPosition1);
//                    break;
//                case "c2":
//                    story.selectNextPosition(nextPosition2);
//                    break;
//                case "c3":
//                    story.selectNextPosition(nextPosition3);
//                    break;
//                case "c4":
//                    story.selectNextPosition(nextPosition4);
//                    break;
//
//            }
//        }
//    }
//
//
//}
