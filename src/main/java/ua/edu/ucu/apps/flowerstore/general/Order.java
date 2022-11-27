package ua.edu.ucu.apps.flowerstore.general;

import lombok.Getter;

import java.util.List;

public class Order {
    @Getter
    private List<Item> order;
    public void addItem(Item item) {
        order.add(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order.toString() +
                '}';
    }
}
