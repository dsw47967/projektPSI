package com.SchoolDean.LoginModule;

import com.SchoolDean.LoginModule.user.User;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private User user;
    private String login;
    private String password;
    private Map<String, User> users = new HashMap<>();

    public boolean login(String username, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public User getUser() {
        return user;
    }
}
