package com.springadvanced.springmvc.service;

import java.util.List;

import com.springadvanced.springmvc.dto.User;

public interface UserService {
    User getById(Long id);
    User getUserByEmail(String email);
    List<User> getUsersByName(String name);
    List<User> getAll();
    void create(User user);
    void remove(Long id);
}
