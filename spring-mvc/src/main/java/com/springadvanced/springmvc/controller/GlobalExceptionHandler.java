package com.springadvanced.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final String ERROR_VIEW_NAME = "error";

    @ExceptionHandler(Throwable.class)
    public String handleException(Throwable ex, Model model) {
        model.addAttribute(ERROR_VIEW_NAME, ex);
        return ERROR_VIEW_NAME;
    }
}
