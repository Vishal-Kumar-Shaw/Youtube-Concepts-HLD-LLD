package OrderDecorator;

import GoodCode.Order;

public class DeliveryDecorator extends OrderDecorator {
    public DeliveryDecorator(Order order) {
        super(order);
    }
    @Override
    public double getCost() {
        return order.getCost()+40;
    }

}
