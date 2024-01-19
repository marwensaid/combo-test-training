package com.managecar.manageCar.model;
import java.util.ArrayList;
import java.util.List;

public class StockCars {
    private final List<Cars> stock;

    public StockCars() {
        this.stock = new ArrayList<>();
    }

    public void ajouterVoiture(Cars cars) {
        this.stock.add(cars);
    }

    public List<Cars> getStock() {
        return this.stock;
    }
}
