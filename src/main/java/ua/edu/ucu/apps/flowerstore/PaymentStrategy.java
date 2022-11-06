package ua.edu.ucu.apps.flowerstore;

public interface PaymentStrategy {
    public boolean pay(Order order, double price);
}
