package com.managecar.manageCar.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {
    @Test
    void testGetModel() {
        Cars cars = new Cars("Toyota", "Red");
        assertEquals("Toyota", cars.getModel());
    }

    @Test
    void testGetCouleur() {
        Cars cars = new Cars("Toyota", "Red");
        assertEquals("Red", cars.getColor());
    }
}
