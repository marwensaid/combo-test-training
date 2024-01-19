package com.managecar.manageCar.controller;// CarControllerIntegrationTest.java
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CarControllerIntegrationTest {

    private int port;

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    void testGetStock() {
        ResponseEntity<String> response = this.restTemplate.getForEntity(
                "http://localhost:" + this.port + "/api/cars/stock", String.class);

        assertEquals(200, response.getStatusCodeValue());
        // Add more assertions based on your expected behavior
    }
}
