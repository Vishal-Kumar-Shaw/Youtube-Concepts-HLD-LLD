package OrderDecorator;

import GoodCode.Order;

public class PlatformFeeDecorator extends OrderDecorator{
    public PlatformFeeDecorator(Order order) {
        super(order);
    }
    @Override
    public double getCost() {
        return order.getCost()+10;
    }
}
