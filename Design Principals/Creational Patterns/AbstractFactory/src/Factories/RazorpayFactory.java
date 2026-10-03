package Factories;

import AbstractFactory.PaymentFactory;
import Interfaces.PaymentProcessor;
import Interfaces.PaymentValidator;
import Razorpay.RazorpayPaymentProcessor;
import Razorpay.RazorpayPaymentValidator;

public class RazorpayFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new RazorpayPaymentProcessor();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new RazorpayPaymentValidator();
    }
}
