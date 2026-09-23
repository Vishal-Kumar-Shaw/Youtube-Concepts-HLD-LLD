package GoodCode;


public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pay by CARD...");
    }
}
