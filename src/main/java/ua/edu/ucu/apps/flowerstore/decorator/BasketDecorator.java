package ua.edu.ucu.apps.flowerstore.decorator;

import ua.edu.ucu.apps.flowerstore.general.Item;

public class BasketDecorator extends ItemDecorator {
    Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return "Basket Decoration " + "price: " + price();
    }
}