package com.testtraining.testtraining.myservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreateUser() {
        String username = "JohnDoe";
        String result = this.userService.createUser(username);
        assertEquals("Utilisateur créé avec succès : " + username, result);
    }

    @Test
    public void testDeleteUser() {
        String username = "JohnDoe";
        boolean result = this.userService.deleteUser(username);
        assertTrue(result);
    }
}
