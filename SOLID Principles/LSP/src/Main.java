import GoodCode.Bird;
import GoodCode.Flyable;
import GoodCode.Penguine;
import GoodCode.Pigeon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Bird pigeon = new Pigeon();
//        pigeon.fly();
//
//        Bird penguin = new Penguine();
//        penguin.fly(); // 💥 Exception
        Bird pigeon = new Pigeon();
        pigeon.eat();

        Bird penguin = new Penguine();
        penguin.eat();

        Flyable flyingBird = new Pigeon();
        flyingBird.fly();
    }
}