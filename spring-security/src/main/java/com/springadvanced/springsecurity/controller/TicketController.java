package com.springadvanced.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springadvanced.springsecurity.entity.Ticket;
import com.springadvanced.springsecurity.service.TicketService;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("ticket", ticketService.getById(id));
        return "ticket";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(Model model) {
        List<Ticket> allTickets =  ticketService.getAll();
        model.addAttribute("tickets", allTickets);
        return "tickets";
    }

    @RequestMapping(value = "/booked-by-event/{id}", method = RequestMethod.GET)
    public String getBookedTicketsByEvent(@PathVariable("id") Long id, Model model) {
        List<Ticket> bookedTicketsByEvent =  ticketService.getBookedTicketsByEventId(id);
        model.addAttribute("tickets", bookedTicketsByEvent);
        return "tickets";
    }

    @RequestMapping(value = "/booked-by-user/{id}", method = RequestMethod.GET)
    public String getBookedTicketsByUser(@PathVariable("id") Long id, Model model) {
        List<Ticket> bookedTicketsByUser =  ticketService.getBookedTicketsByEventId(id);
        model.addAttribute("tickets", bookedTicketsByUser);
        return "tickets";
    }

    @RequestMapping(value = "/booked", method = RequestMethod.GET)
    public String getBoockedTickets(Model model) {
        List<Ticket> boockedTickets =  ticketService.getBookedTickets();
        model.addAttribute("tickets", boockedTickets);
        return "tickets";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Ticket ticket) {
        ticketService.create(ticket);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void remove(@PathVariable("id") Long id) {
        ticketService.remove(id);
    }
}
