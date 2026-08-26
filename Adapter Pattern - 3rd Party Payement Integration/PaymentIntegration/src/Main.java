import com.payment.adapter.PayPalAdapter;
import com.payment.gateway.PayPal;
import com.payment.gateway.RazorPay;
import com.payment.service.PaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PayPal paypal = new PayPal();
        PayPalAdapter payPalAdapter = new PayPalAdapter(paypal);
        PaymentService paymentService = new PaymentService(payPalAdapter);

        paymentService.makePayment(4000);
    }
}