package com.login;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private Map<String, String> users = new HashMap<>();

    public LoginService() {
        // Username and Password stored
        users.put("admin", "admin123");
        users.put("user", "user123");
        users.put("test", "test123");
    }

    public boolean validateLogin(String username, String password) {
        if (users.containsKey(username)) {
            return users.get(username).equals(password);
        }
        return false;
    }
}