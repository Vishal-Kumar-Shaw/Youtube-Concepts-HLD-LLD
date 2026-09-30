package GoodCode;

public class PaymentFactory {
    public static Payment2 getPayment(String payType) {
        if(payType.equalsIgnoreCase("UPI")) {
            return new UPIPayment2();
        } else if(payType.equalsIgnoreCase("CARD")) {
            return new CardPayment2();
        } else if(payType.equalsIgnoreCase("WALLET")) {
            return new WalletPayment2();
        }

        return null;
    }
}
