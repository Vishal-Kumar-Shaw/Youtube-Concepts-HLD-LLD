import BadCode.CardPayment;
import BadCode.Payment;
import BadCode.UPIPayment;
import BadCode.WalletPayment;
import GoodCode.Payment2;
import GoodCode.PaymentFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payment payment = null;
        String paymentType = "UPI";

        if(paymentType.equals("UPI")){
            payment = new UPIPayment();
        }else if(paymentType.equals("CARD")){
            payment = new CardPayment();
        }else if(paymentType.equals("WALLET")){
            payment = new WalletPayment();
        }
        payment.pay();


        // Good Code, just added 2 for differentiating
        String paymentType2 = "CARD";
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment2 payment2 = paymentFactory.getPayment(paymentType2);
        payment2.pay();


    }
}