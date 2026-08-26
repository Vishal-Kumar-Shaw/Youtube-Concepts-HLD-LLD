package com.payment.adapter;

import com.payment.gateway.PayPal;

public class PayPalAdapter implements PaymentProcessor{

    private PayPal payPal;
    public PayPalAdapter(PayPal paypal) {
        this.payPal = paypal;
    }
    @Override
    public void pay(double amount) {
        this.payPal.createPayment(amount);
    }
}
