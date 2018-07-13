package com.springadvanced.springmvc.dto;

import java.time.LocalDate;

public class Event {
    private Long id;
    private String content;
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public Event setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Event setContent(String content) {
        this.content = content;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Event setDate(LocalDate date) {
        this.date = date;
        return this;
    }
}
