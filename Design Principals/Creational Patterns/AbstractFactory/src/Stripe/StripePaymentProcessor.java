package Stripe;

import Interfaces.PaymentProcessor;

public class StripePaymentProcessor implements PaymentProcessor {
    public void pay(){
        System.out.println("Razorpay Payment Done...");
    }
}
