package ua.edu.ucu.apps.flowerstore.payment;

import ua.edu.ucu.apps.flowerstore.general.Order;

public interface PaymentStrategy {
    public boolean pay(Order order, double price);
}
