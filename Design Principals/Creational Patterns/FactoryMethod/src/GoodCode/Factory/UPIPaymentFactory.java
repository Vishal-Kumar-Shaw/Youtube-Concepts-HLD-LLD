package GoodCode.Factory;

import GoodCode.AbstractFactory.PaymentFactory;
import GoodCode.Interfaces.Payment;
import GoodCode.PaymentMethods.UPIPayment;

public class UPIPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UPIPayment();
    }
}
