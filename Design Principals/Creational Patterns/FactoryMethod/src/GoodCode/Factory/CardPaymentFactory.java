package GoodCode.Factory;

import GoodCode.AbstractFactory.PaymentFactory;
import GoodCode.PaymentMethods.CardPayment;
import GoodCode.Interfaces.Payment;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CardPayment();
    }
}
