package PaymentGateway;

public class Stripe implements PaymentGateway {
    @Override
    public void pay() {
        System.out.println("Paid using Stripe");
    }
    @Override
    public void refund() {
        System.out.println("Refunded using Stripe");
    }
}
