package com.springadvanced.springmvc.service;

import java.util.List;

import com.springadvanced.springmvc.dto.Ticket;

public interface TicketService {
    Ticket getById(Long id);
    List<Ticket> getAll();
    List<Ticket> getBookedTickets();
    List<Ticket> getBookedTicketsByEventId(Long id);
    List<Ticket> getBookedTicketsByUserId(Long id);
    void create(Ticket ticket);
    void remove(Long id);
}
