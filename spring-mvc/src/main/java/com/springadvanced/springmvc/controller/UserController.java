package com.springadvanced.springmvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springadvanced.springmvc.dto.User;
import com.springadvanced.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Long id, Model model) {
        User userById =  userService.getById(id);
        model.addAttribute("user", userById);
        return "user";
    }

    @RequestMapping(value = "/by-name/{name}", method = RequestMethod.GET)
    public String getUsersByName(@PathVariable("name") String name, Model model) {
        List<User> usersByName = userService.getUsersByName(name);
        model.addAttribute("users", usersByName);
        return "users";
    }

    @RequestMapping(value = "/by-email", method = RequestMethod.POST)
    public String getByEmail(@RequestParam String email, Model model) {
        User userByEmail = userService.getUserByEmail(email);
        model.addAttribute("user", userByEmail);
        return "user";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "users";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove(@PathParam("id") Long id) {
        userService.remove(id);
    }
}
