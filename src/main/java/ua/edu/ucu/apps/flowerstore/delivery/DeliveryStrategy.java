package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.general.Order;

public interface DeliveryStrategy {
    public int deliver(Order order, String adress);
}
