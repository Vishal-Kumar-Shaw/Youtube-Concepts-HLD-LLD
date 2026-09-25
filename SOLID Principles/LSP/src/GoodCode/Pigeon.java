package GoodCode;

public class Pigeon extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Pigeon is flying!...");
    }
}
