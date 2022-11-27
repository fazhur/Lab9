package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.general.Order;

public class PostDeliveryStrategy implements DeliveryStrategy {
    public PostDeliveryStrategy() {
    }
    @Override
    public int deliver(Order order, String adress) {
//        delivery via Post...
        int deliveryNumber = 12345;
        return deliveryNumber;
    }
}
