package GoodCode;

public class UPIPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pay by UPI...");
    }
}
