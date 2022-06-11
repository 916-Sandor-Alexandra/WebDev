package com.example.userauth.service;

import com.example.userauth.model.Role;
import com.example.userauth.model.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
