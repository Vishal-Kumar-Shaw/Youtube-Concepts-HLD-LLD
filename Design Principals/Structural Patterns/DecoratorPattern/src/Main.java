import GoodCode.BasicOrder;
import GoodCode.Order;
import OrderDecorator.DeliveryDecorator;
import OrderDecorator.PackagingDecorator;
import OrderDecorator.PlatformFeeDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new BasicOrder();

        order = new PackagingDecorator(order);
        order = new DeliveryDecorator(order);
        order = new PlatformFeeDecorator(order);

        System.out.println(order.getCost());

        Order order2 = new PlatformFeeDecorator(
                        new DeliveryDecorator(
                            new PackagingDecorator
                                (new BasicOrder())));

        System.out.println(order2.getCost());
    }
}