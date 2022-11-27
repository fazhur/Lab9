package ua.edu.ucu.apps.flowerstore.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.general.Order;

@Getter
public class ContextDelivery {
    private DeliveryStrategy strategy;
    private Order order;
    private String adress;

    public ContextDelivery(Order order, String adress) {
        this.order = order;
        this.adress = adress;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public int deliver() {
        int deliveryNumber = strategy.deliver(order, adress);
        return deliveryNumber;
    }

    @Override
    public String toString() {
        return "ContextDelivery{" +
                "strategy=" + strategy +
                ", order=" + order +
                ", adress='" + adress + '\'' +
                '}';
    }
}
