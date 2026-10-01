package GoodCode.PaymentMethods;

import GoodCode.Interfaces.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Card payment done...");
    }
}
