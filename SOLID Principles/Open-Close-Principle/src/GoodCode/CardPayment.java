package GoodCode;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pay by CARD...");
    }
}
