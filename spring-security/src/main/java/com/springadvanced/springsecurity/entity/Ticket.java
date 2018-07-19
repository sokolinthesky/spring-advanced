package com.springadvanced.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
    @Id
    private Long id;
    private String title;
    private Long userId;
    private Long eventId;
    private boolean booked;

    public Ticket() {
    }

    public Ticket(Long id, String title, Long userId, Long eventId, boolean booked) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.eventId = eventId;
        this.booked = booked;
    }

    public Long getId() {
        return id;
    }

    public Ticket setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Ticket setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Ticket setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getEventId() {
        return eventId;
    }

    public Ticket setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }

    public boolean isBooked() {
        return booked;
    }

    public Ticket setBooked(boolean booked) {
        this.booked = booked;
        return this;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", eventId=" + eventId +
                ", booked=" + booked +
                '}';
    }
}
