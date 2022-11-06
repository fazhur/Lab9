package ua.edu.ucu.apps.flowerstore;

import lombok.Getter;

import java.util.ArrayList;

public class Store {
    @Getter
    private ArrayList<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public boolean searchBucket(FlowerBucket bucket) {
        return buckets.contains(bucket);
    }

    public static void main(String[] args) {
        System.out.println(new Flower(10, FlowerColor.BLUE, 100, FlowerType.ROSE));
    }
}
