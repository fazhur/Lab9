package ua.edu.ucu.apps.flowerstore.decorator;

import ua.edu.ucu.apps.flowerstore.general.Item;

public class RibbonDecorator extends ItemDecorator {
    Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "Ribbon Decoration " + "price: " + price();    }
}