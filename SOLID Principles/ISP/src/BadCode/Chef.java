package BadCode;

public class Chef implements Employee {
    @Override
    public void cook() {
        System.out.println("cook");
    }

    @Override
    public void clean() {
        throw new UnsupportedOperationException("Cook doesn't clean");
    }

    @Override
    public void serve() {
        throw new UnsupportedOperationException("Cook doesn't serve");
    }
}
