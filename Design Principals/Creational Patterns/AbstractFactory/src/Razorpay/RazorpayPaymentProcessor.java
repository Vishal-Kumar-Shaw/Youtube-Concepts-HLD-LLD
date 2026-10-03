package Razorpay;

import Interfaces.PaymentProcessor;

public class RazorpayPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(){
        System.out.println("Razorpay Payment Done...");
    }
}
