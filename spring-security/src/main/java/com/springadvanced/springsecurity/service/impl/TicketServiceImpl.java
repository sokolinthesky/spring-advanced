package com.springadvanced.springsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springadvanced.springsecurity.entity.Ticket;
import com.springadvanced.springsecurity.repository.TicketRepository;
import com.springadvanced.springsecurity.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket getById(Long id) {
        return ticketRepository.getOne(id);
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public List<Ticket> getBookedTickets() {
        return ticketRepository.getBookedTickets();
    }

    @Override
    public List<Ticket> getBookedTicketsByEventId(Long id) {
        return ticketRepository.getBookedTicketsByEventId(id);
    }

    @Override
    public List<Ticket> getBookedTicketsByUserId(Long id) {
        return ticketRepository.getBookedTicketsByUserId(id);
    }

    @Override
    public void create(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void addTickets(List<Ticket> tickets) {
        ticketRepository.saveAll(tickets);
    }

    @Override
    public void remove(Long id) {
        ticketRepository.deleteById(id);
    }
}
