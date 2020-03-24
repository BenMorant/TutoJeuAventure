import adventuregame.model.items.Anorak;
import adventuregame.model.items.Item;

public class TutoJeuAventureMain {

    public static void main(String[] args) {

        Item anorak = new Anorak(2, "anorak", "/anorak.jpg", "un anorak chaud", 12);

        System.out.println("anorak.getImage() = " + anorak.getImage());

    }
}
