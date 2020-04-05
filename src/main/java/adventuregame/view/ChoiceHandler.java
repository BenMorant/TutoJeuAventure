package adventuregame.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    private VisibilityManager vm;

    @Override
    public void actionPerformed(ActionEvent event) {

        String yourChoice = event.getActionCommand();

        switch (yourChoice) {
            case "start":
                //    vm.fromTitlePanelToMainPanel();
                //          story.townGate();
                break;
            case "c1":
//                    story.selectNextPosition(nextPosition1);
                break;
            case "c2":
//                    story.selectNextPosition(nextPosition2);
                break;
            case "c3":
//                    story.selectNextPosition(nextPosition3);
                break;
            case "c4":
//                    story.selectNextPosition(nextPosition4);
                break;

        }
    }
}
