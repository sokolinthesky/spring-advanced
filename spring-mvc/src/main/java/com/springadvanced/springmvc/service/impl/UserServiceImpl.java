package com.springadvanced.springmvc.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springadvanced.springmvc.dto.User;
import com.springadvanced.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return new User(1L, "Name", "lol@lol.lol");
    }

    @Override
    public User getUserByEmail(String email) {
        return new User(1L, "By Email", email);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return Collections.singletonList(new User(1L, name, "lol@lol.lol"));
    }

    @Override
    public List<User> getAll() {
        return Collections.singletonList(new User(1L, "Name2", "lol@lol.lol"));
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void remove(Long id) {

    }
}
