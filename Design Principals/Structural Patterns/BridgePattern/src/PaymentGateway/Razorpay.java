package PaymentGateway;

public class Razorpay implements PaymentGateway {
    @Override
    public void pay() {
        System.out.println("Paid via Razorpay");
    }
    @Override
    public void refund() {
        System.out.println("Refunded via Razorpay");
    }
}
