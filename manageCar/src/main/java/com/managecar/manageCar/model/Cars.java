package com.managecar.manageCar.model;

public class Cars {
    private final String model;
    private final String color;

    public Cars(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }
}
