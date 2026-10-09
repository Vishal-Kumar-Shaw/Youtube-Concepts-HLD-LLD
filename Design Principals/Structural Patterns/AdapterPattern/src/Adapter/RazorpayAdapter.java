package Adapter;

import PaymentService.PaymentGateway;
import RazorpaySDK.RazorpaySDK;

public class RazorpayAdapter implements PaymentGateway {
    RazorpaySDK razorpaySDK = new RazorpaySDK();
    public void pay(double amount) {
        razorpaySDK.makePayment(amount);
    }
}
