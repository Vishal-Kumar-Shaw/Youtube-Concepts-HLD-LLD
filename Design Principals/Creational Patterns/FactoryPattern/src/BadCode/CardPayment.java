package BadCode;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("CardPayment pay");
    }
}
