package models;

public class Order {
    public int productId;
    public int userId;
    public int amount;

    public Order(int orderId, int userId, int amount) {
        this.productId = orderId;
        this.userId = userId;
        this.amount = amount;
    }
}
