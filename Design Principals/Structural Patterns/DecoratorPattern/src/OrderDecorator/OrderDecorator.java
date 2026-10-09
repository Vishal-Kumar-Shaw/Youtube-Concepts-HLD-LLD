package OrderDecorator;

import GoodCode.Order;

abstract class OrderDecorator implements Order {
    protected Order order;
    public OrderDecorator(Order order) {
        this.order = order;
    }
}
