package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.general.Order;

public class DHLDeliveryStrategy implements DeliveryStrategy {
    public DHLDeliveryStrategy() {
    }

    @Override
    public int deliver(Order order, String adress) {
//        delivery via DHL...
        int deliveryNumber = 12345;
        return deliveryNumber;
    }
}