package com.cat2client.clientapp.Models;

import java.util.List;

public class Movie {
    private long id;
    private String title;
    private String slug;
    private List<Category> category;
    private int runtime;
    private String type;
    private List<ProductionCompany> companies;
    private User createdBy;

    public Movie(String title, String slug, List<Category> category, int runtime, String type, List<ProductionCompany> companies, User createdBy) {
        this.title = title;
        this.slug = slug;
        this.category = category;
        this.runtime = runtime;
        this.type = type;
        this.companies = companies;
        this.createdBy = createdBy;
    }

    public Movie(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ProductionCompany> getCompanies() {
        return companies;
    }

    public void setCompanies(List<ProductionCompany> companies) {
        this.companies = companies;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}
