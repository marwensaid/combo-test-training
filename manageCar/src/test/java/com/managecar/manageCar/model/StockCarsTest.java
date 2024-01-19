package com.managecar.manageCar.model;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StockCarsTest {
    @Test
    void testAjouterVoiture() {
        StockCars stock = new StockCars();
        Cars cars = new Cars("Toyota", "Red");

        stock.ajouterVoiture(cars);

        List<Cars> listeCars = stock.getStock();
        assertEquals(1, listeCars.size());
        assertEquals("Toyota", listeCars.get(0).getModel());
        assertEquals("Red", listeCars.get(0).getColor());
    }
}
