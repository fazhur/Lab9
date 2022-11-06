package ua.edu.ucu.apps.flowerstore;

public class CactusFlower extends Flower{

    public CactusFlower(double price) {
        super(0.0, FlowerColor.GREEN, price, FlowerType.CACTUS);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{color=" + getColor() +
                ", price=" + getPrice() +
                '}';
    }
}
