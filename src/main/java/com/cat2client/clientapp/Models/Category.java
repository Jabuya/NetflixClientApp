package com.cat2client.clientapp.Models;

public class Category {
    private String id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
