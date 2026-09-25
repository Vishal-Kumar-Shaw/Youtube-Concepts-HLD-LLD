package BadCode;

public class Penguine extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException(
                "Penguins cannot fly!"
        );
    }
}
