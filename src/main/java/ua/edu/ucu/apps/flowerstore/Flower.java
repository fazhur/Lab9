package ua.edu.ucu.apps.flowerstore;

import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {

    }

    @Override
    public String getDescription() {
        return  this.getClass().getSimpleName() + "{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price +
                ", flowerType=" + flowerType +
                '}';
    }

    public double price() {
        return this.price;
    }

    public Flower(double sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
