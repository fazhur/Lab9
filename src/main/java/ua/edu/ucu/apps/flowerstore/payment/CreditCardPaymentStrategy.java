package ua.edu.ucu.apps.flowerstore.payment;

import ua.edu.ucu.apps.flowerstore.general.Order;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(Order order, double price) {
//      Credit card payment...
        return true;
    }
}
