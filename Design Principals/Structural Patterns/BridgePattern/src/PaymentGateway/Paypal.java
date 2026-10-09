package PaymentGateway;

public class Paypal implements PaymentGateway {
    @Override
    public void pay() {
        System.out.println("Paypal using Stripe");
    }

    @Override
    public void refund() {
        System.out.println("Refunded using Stripe");
    }
}
