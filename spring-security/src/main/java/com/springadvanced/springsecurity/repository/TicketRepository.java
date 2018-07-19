package com.springadvanced.springsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springadvanced.springsecurity.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("SELECT t FROM Ticket t WHERE t.booked = true")
    List<Ticket> getBookedTickets();

    List<Ticket> getBookedTicketsByEventId(@Param("eventId") Long eventId);

    List<Ticket> getBookedTicketsByUserId(@Param("userId") Long userId);
}
