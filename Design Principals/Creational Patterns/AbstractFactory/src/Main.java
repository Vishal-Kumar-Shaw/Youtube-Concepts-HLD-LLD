import AbstractFactory.PaymentFactory;
import Factories.RazorpayFactory;
import Interfaces.PaymentProcessor;
import Interfaces.PaymentValidator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentFactory razorpay = new RazorpayFactory();
        PaymentValidator validator = razorpay.createPaymentValidator();
        PaymentProcessor processor = razorpay.createPaymentProcessor();

        if(validator.validate("Razorpay Payment")){
            processor.pay();
        }
    }
}