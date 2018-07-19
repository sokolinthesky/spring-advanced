package com.springadvanced.springsecurity.service;

import java.util.List;

import com.springadvanced.springsecurity.entity.Ticket;

public interface TicketService {
    Ticket getById(Long id);
    List<Ticket> getAll();
    List<Ticket> getBookedTickets();
    List<Ticket> getBookedTicketsByEventId(Long id);
    List<Ticket> getBookedTicketsByUserId(Long id);
    void create(Ticket ticket);
    void addTickets(List<Ticket> tickets);
    void remove(Long id);
}
