package ua.edu.ucu.apps.flowerstore.payment;

import ua.edu.ucu.apps.flowerstore.general.Order;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean pay(Order order, double price) {
//      PayPal payment...
        return false;
    }
}
