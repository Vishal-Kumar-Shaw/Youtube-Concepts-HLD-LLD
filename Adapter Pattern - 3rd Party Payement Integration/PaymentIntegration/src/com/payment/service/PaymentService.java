package com.payment.service;

import com.payment.adapter.PaymentProcessor;
import com.payment.gateway.RazorPay;

public class PaymentService {
    PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.pay(amount);
    }

}
