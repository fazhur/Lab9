package ua.edu.ucu.apps.flowerstore;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(Order order, double price) {
//      Credit card payment...
        return true;
    }
}
