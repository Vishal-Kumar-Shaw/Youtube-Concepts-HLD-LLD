import GoodCode.AbstractFactory.PaymentFactory;
import GoodCode.Factory.CardPaymentFactory;
import GoodCode.Interfaces.Payment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PaymentFactory paymentFactory = new CardPaymentFactory();
        Payment payment = paymentFactory.createPayment();
        payment.pay();
    }
}