package com.cat2client.clientapp.Models;

public class Errors {
    private String message;

    public Errors(String message) {
        this.message = message;
    }

    public Errors(){

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
