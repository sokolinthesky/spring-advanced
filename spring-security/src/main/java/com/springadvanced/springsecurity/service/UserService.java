package com.springadvanced.springsecurity.service;

import java.util.List;

import com.springadvanced.springsecurity.entity.User;

public interface UserService {
    User getById(Long id);
    User getUserByEmail(String email);
    List<User> getUsersByName(String name);
    List<User> getAll();
    void create(User user);
    void addUsers(List<User> users);
    void remove(Long id);
}
