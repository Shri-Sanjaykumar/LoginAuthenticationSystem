package com.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    public void testLoginSuccess() {
        LoginService service = new LoginService();
        assertTrue(service.validateLogin("admin", "admin123"));
    }

    @Test
    public void testLoginFail() {
        LoginService service = new LoginService();
        assertFalse(service.validateLogin("admin", "wrong"));
    }
}