package GoodCode.Factory;

import GoodCode.AbstractFactory.PaymentFactory;
import GoodCode.Interfaces.Payment;
import GoodCode.PaymentMethods.WalletPayment;

public class WalletPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new WalletPayment();
    }
}
