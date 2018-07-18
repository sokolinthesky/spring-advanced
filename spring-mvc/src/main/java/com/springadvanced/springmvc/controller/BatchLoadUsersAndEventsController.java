package com.springadvanced.springmvc.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.springadvanced.springmvc.dto.Ticket;
import com.springadvanced.springmvc.dto.User;
import com.springadvanced.springmvc.service.TicketService;
import com.springadvanced.springmvc.service.UserService;

@Controller
@RequestMapping("/load")
public class BatchLoadUsersAndEventsController {

    @Autowired
    private TicketService ticketService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void loadUsers(@RequestParam("file") MultipartFile uploadingFile) throws IOException {
        String json = new String(uploadingFile.getBytes());
        User[] data = new Gson().fromJson(json, User[].class);
        userService.addUsers(Arrays.asList(data));
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void loadEvents(@RequestParam("file") MultipartFile uploadingFile) throws IOException {
        String json = new String(uploadingFile.getBytes());
        Ticket[] data = new Gson().fromJson(json, Ticket[].class);
        ticketService.addTickets(Arrays.asList(data));
    }
}
