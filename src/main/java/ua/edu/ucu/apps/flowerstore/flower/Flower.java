package ua.edu.ucu.apps.flowerstore.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.general.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter @Getter @Entity @Table @AllArgsConstructor @NoArgsConstructor
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    @Override
    public String getDescription() {
        return  this.getFlowerType() + "{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price + '}';
    }

    public double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
