package com.payment.adapter;

import com.payment.gateway.StripePay;

public class StripePayAdapter implements PaymentProcessor {
    StripePay stripePay;
    public StripePayAdapter(StripePay stripePay) {
        this.stripePay = stripePay;
    }

    @Override
    public void pay(double amount) {
        this.stripePay.makePayment(amount);
    }
}
