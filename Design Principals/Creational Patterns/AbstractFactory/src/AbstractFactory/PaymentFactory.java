package AbstractFactory;

import Interfaces.PaymentProcessor;
import Interfaces.PaymentValidator;

public interface PaymentFactory {
    PaymentProcessor createPaymentProcessor();
    PaymentValidator createPaymentValidator();
}
