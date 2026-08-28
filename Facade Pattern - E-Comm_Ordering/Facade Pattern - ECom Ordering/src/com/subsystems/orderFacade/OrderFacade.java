package com.subsystems.orderFacade;

import com.subsystems.Inventory.InventoryService;
import com.subsystems.Notification.NotificationService;
import com.subsystems.PaymentService.PaymentService;
import com.subsystems.Shipping.ShippingService;
import models.Order;

public class OrderFacade {
     public boolean placeOrder(Order order) {
         InventoryService inventory = new InventoryService();
         PaymentService paymentService = new PaymentService();
         ShippingService shippingService = new ShippingService();
         NotificationService notificationService = new NotificationService();

         // checking the inventory
         if(!inventory.checkInventory(order.productId)) {
             return false;
         }

         // calling the payment service for payment
         if(!paymentService.pay(order.amount)) {
             return false;
         }
         shippingService.createShippment(order.productId);
         notificationService.sendNotification(order.productId, order.userId);

         return true;
     }
}
