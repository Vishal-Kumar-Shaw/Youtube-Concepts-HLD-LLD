package GoodCode.PaymentMethods;

import GoodCode.Interfaces.Payment;

public class WalletPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Wallet Payment done...");
    }
}
