package com.marcossbento.webServicesProject.services.exceptions;

public class DatabaseExcepiton extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DatabaseExcepiton(String msg) {
        super(msg);
    }
}
