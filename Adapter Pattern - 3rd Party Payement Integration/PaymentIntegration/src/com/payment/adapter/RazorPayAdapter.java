package com.payment.adapter;

import com.payment.gateway.RazorPay;

public class RazorPayAdapter implements PaymentProcessor {

    private RazorPay razorpay;
    public RazorPayAdapter(RazorPay razorpay) {
        this.razorpay = razorpay;
    }
    @Override
    public void pay(double amount) {
        razorpay.createOrder(amount);
    }
}
