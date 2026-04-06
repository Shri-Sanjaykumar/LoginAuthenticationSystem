package com.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService service = new LoginService();
        assertTrue(service.validateLogin("admin", "admin123"));
    }

    @Test
    public void testInvalidLogin() {
        LoginService service = new LoginService();
        assertFalse(service.validateLogin("admin", "wrong"));
    }
}