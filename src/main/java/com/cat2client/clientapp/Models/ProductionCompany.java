package com.cat2client.clientapp.Models;

public class ProductionCompany {
    private int id;
    private String name;
    private String slug;

    public ProductionCompany(){

    }

    public ProductionCompany(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
