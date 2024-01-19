package com.managecar.manageCar.controller;
import com.managecar.manageCar.model.Cars;
import com.managecar.manageCar.model.StockCars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private final StockCars stockCars;

    @Autowired
    public CarsController(StockCars stockCars) {
        this.stockCars = stockCars;
    }

    @GetMapping("/stock")
    public List<Cars> getStock() {
        return this.stockCars.getStock();
    }
}
