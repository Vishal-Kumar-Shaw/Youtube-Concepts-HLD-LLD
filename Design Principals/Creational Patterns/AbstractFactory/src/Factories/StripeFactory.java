package Factories;

import AbstractFactory.PaymentFactory;
import Interfaces.PaymentProcessor;
import Interfaces.PaymentValidator;
import Razorpay.RazorpayPaymentValidator;
import Stripe.StripePaymentProcessor;

public class StripeFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new RazorpayPaymentValidator();
    }
}
