package com.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    LoginService service = new LoginService();

    @Test
    public void testLoginSuccess() {
        assertTrue(service.validateLogin("admin", "admin123"));
    }

    @Test
    public void testLoginFailWrongPassword() {
        assertFalse(service.validateLogin("admin", "wrong"));
    }

    @Test
    public void testLoginFailWrongUsername() {
        assertFalse(service.validateLogin("wrong", "admin123"));
    }
}