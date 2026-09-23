import GoodCode.CardPayment;
import GoodCode.PayPal;
import GoodCode.PaymentProcessor;
import GoodCode.UPIPayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      PaymentProcessor paymentProcessor = new PaymentProcessor();
      paymentProcessor.processPayment(new UPIPayment());
      paymentProcessor.processPayment(new CardPayment());
      paymentProcessor.processPayment(new PayPal());

    }
}