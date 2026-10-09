package PaymentService;

public class Gateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("paid "+ amount+" through payment gateway");
    }
}
