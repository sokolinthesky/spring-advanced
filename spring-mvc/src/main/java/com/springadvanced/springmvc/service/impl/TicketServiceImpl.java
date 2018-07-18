package com.springadvanced.springmvc.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springadvanced.springmvc.dto.Ticket;
import com.springadvanced.springmvc.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public Ticket getById(Long id) {
        return new Ticket(id, "content", 1L, 2L, false);
    }

    @Override
    public List<Ticket> getAll() {
        return Collections.singletonList(new Ticket(1L, "content", 1L, 2L, false));
    }

    @Override
    public List<Ticket> getBookedTickets() {
        return Arrays.asList(new Ticket(1L, "booked ticket content", 1L, 2L, true),
                new Ticket(1L, "booked ticket content 2", 1L, 2L, true));
    }

    @Override
    public List<Ticket> getBookedTicketsByEventId(Long id) {
        return Arrays.asList(
                new Ticket(1L, "by event id ticket content", 1L, 2L, true),
                new Ticket(1L, "by event id ticket content 2", 1L, 2L, true));
    }

    @Override
    public List<Ticket> getBookedTicketsByUserId(Long id) {
        return Arrays.asList(
                new Ticket(1L, "by user ticket id ticket content", 1L, 2L, true),
                new Ticket(1L, "by user ticket content 2", 1L, 2L, true));
    }

    @Override
    public void create(Ticket ticket) {

    }

    @Override
    public void addTickets(List<Ticket> tickets) {
        System.out.println("Adding tickets...");
    }

    @Override
    public void remove(Long id) {

    }
}
