package com.springadvanced.springsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springadvanced.springsecurity.entity.User;
import com.springadvanced.springsecurity.repository.UserRepository;
import com.springadvanced.springsecurity.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return getUsersByName(name);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public void addUsers(List<User> users) {
        userRepository.saveAll(users);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
