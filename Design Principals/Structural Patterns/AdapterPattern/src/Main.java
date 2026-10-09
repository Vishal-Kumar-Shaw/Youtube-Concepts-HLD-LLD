import Adapter.RazorpayAdapter;
import PaymentService.Gateway;
import PaymentService.PaymentGateway;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Gateway gateway = new Gateway();
       gateway.pay(2000);

        PaymentGateway gateway1 = new RazorpayAdapter();
        gateway1.pay(2000);
    }
}