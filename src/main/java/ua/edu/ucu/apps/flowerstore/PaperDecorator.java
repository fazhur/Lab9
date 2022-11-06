package ua.edu.ucu.apps.flowerstore;

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
