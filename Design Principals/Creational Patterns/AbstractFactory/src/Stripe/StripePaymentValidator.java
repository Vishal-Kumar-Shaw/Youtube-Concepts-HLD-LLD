package Stripe;

import Interfaces.PaymentValidator;

public class StripePaymentValidator implements PaymentValidator {

    @Override
    public boolean validate(String payment) {
        return true;
    }
}
