package ua.edu.ucu.apps.flowerstore;

public interface DeliveryStrategy {
    public int deliver(Order order, String adress);
}
