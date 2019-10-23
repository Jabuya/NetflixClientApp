package com.cat2client.clientapp.Models;

public class Movie {
    private String title;
    private String slug;
    private Category category;
    private int runtime;
    private String type;
    private ProductionCompany companies;
    private User createdBy;

    public Movie(String title, Category category, int runtime, String type, ProductionCompany companies, User createdBy) {
        this.title = title;
        this.category = category;
        this.runtime = runtime;
        this.type = type;
        this.companies = companies;
        this.createdBy = createdBy;
    }

    public Movie(){

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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

    public ProductionCompany getCompanies() {
        return companies;
    }

    public void setCompanies(ProductionCompany companies) {
        this.companies = companies;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}
