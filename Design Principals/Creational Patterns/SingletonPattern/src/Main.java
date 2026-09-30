import Singleton.BadLoggerClass;
import Singleton.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BadLoggerClass obj1 = new BadLoggerClass();
        BadLoggerClass obj2 = new BadLoggerClass();
        System.out.println(obj1.equals(obj2));

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println(l1.equals(l2));

    }
}