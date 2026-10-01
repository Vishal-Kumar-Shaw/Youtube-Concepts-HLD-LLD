package GoodCode.PaymentMethods;

import GoodCode.Interfaces.Payment;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI payment done...");
    }
}
