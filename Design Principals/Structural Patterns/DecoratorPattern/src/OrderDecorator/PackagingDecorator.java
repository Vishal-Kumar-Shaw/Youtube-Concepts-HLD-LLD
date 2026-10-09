package OrderDecorator;

import GoodCode.Order;

public class PackagingDecorator extends OrderDecorator {

    public PackagingDecorator(Order order) {
        super(order);
    }
    public double getCost() {
        return order.getCost()+20;
    }
}
