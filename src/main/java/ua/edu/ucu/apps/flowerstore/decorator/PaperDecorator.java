package ua.edu.ucu.apps.flowerstore.decorator;

import ua.edu.ucu.apps.flowerstore.general.Item;

public class PaperDecorator extends ItemDecorator {
    Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return "Paper Decoration " + "price: " + price();
    }
}
