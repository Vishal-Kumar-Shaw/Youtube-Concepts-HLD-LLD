package Razorpay;

import Interfaces.PaymentValidator;

public class RazorpayPaymentValidator implements PaymentValidator {

    @Override
    public boolean validate(String payment) {
        return true;
    }
}
