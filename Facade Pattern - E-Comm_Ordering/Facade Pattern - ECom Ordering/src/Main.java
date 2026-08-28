import com.subsystems.Inventory.InventoryService;
import com.subsystems.Notification.NotificationService;
import com.subsystems.PaymentService.PaymentService;
import com.subsystems.Shipping.ShippingService;
import com.subsystems.orderFacade.OrderFacade;
import models.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        Order o1 = new Order(1,1,2000);
        if(orderFacade.placeOrder(o1)){
            System.out.println("Order Placed Successfully");
        }else{
            System.out.println("Order Placed Failed");
        }

    }
}