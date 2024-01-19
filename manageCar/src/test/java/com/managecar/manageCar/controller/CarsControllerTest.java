package com.managecar.manageCar.controller;// CarControllerUnitTest.java
import com.managecar.manageCar.controller.CarsController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CarsController.class)
class CarsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetStock() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/cars/stock"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        // Add more assertions based on your expected behavior
    }
}
