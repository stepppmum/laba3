import Actions.*;
import characters.*;
import things.Couch;
import things.Door;
import things.Ladder;
import things.Thing;

public class Main {
    public static void main(String[] args){
        INeznayka neznaika = new Neznaika();
        Thing door = new Door(true);
        Thing couch = new Couch();
        Thing ladder = new Ladder();
        Malishka knopochka = new Knopochka();
        Malishka sineglazka = new Sineglazka();
        neznaika.doAction(Actions.LAY, couch);
        System.out.print("Как вдруг ");
        neznaika.doAction(Actions.LISTEN, "возню. ");
        knopochka.doAction(Actions.ARGUE, sineglazka);
        neznaika.openDoor();
        neznaika.doAction(Actions.SEE, knopochka);
        neznaika.doAction(Actions.SEE, sineglazka);
        neznaika.isAnnoyed();
        knopochka.isAfraid();
        sineglazka.isAfraid();
        knopochka.doAction(Actions.RUN, ladder);
        sineglazka.doAction(Actions.RUN, ladder);

    }
}
