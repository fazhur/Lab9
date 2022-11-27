package ua.edu.ucu.apps.flowerstore.flower;

import lombok.Getter;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"),
        WHITE("#FFFFFF"), YELLOW("#FFFF00"),
        GREEN("#00FF00");
    @Getter
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
