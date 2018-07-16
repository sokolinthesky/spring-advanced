package com.springadvanced.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springadvanced.springmvc.service.TicketService;

@Controller
@RequestMapping(value = "/booked-tickets-pdf", headers = "Accept=application/pdf",
        produces = "application/pdf")
public class BookedTicketsPdfController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/by-user/{userId}", method = RequestMethod.GET)
    public ModelAndView getBookedTicketsByUser(@PathVariable("userId") Long userId)  {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("tickets", ticketService.getBookedTicketsByUserId(userId));
        return modelAndView;
    }

    @RequestMapping(value = "/by-event/{eventId}", method = RequestMethod.GET)
    public ModelAndView getBookedTicketsByEvent(@PathVariable("eventId") Long eventId)  {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("tickets", ticketService.getBookedTicketsByEventId(eventId));
        return modelAndView;
    }
}
