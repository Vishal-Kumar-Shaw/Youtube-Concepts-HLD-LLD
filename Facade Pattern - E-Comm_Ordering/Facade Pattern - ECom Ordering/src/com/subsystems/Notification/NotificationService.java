package com.subsystems.Notification;

public class NotificationService {
    public void sendNotification(int productId, int orderId) {
        System.out.println("Your product with product id "+ productId + " has been sent to your shipping service.");
    }
}
