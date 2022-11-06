package ua.edu.ucu.apps.flowerstore;

public class RomashkaFlower extends Flower{
    public RomashkaFlower(double sepalLength, double price) {
        super(sepalLength, FlowerColor.WHITE, price, FlowerType.ROMASHKA);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{sepalLength=" + getSepalLength() +
                ", color=" + getColor() +
                ", price=" + getPrice() +
                '}';
    }
}
