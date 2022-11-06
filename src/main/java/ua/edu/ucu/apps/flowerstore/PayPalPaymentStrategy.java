package ua.edu.ucu.apps.flowerstore;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean pay(Order order, double price) {
//      PayPal payment...
        return false;
    }
}
