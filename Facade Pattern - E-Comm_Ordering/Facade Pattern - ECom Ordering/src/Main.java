import com.subsystems.Inventory.InventoryService;
import com.subsystems.Notification.NotificationService;
import com.subsystems.PaymentService.PaymentService;
import com.subsystems.Shipping.ShippingService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        NotificationService notificationService = new NotificationService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        boolean ifAvailable = inventoryService.checkInventory("1");
        if(ifAvailable){
            paymentService.pay(2000);
            shippingService.createShippment("1");
            notificationService.sendNotification("1");
        }

    }
}