package com.cat2client.clientapp.Models;

import java.util.List;

public class CreateMovieDto {
    private String title;
    private List<String> categories;
    private int runtime;
    private List<Integer> productionCompaniesIds;

    public CreateMovieDto(String title, List<String> categories, int runtime, List<Integer> productionCompaniesIds) {
        this.title = title;
        this.categories = categories;
        this.runtime = runtime;
        this.productionCompaniesIds = productionCompaniesIds;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public int getRuntime() {
        return runtime;
    }

    public List<Integer> getProductionCompaniesIds() {
        return productionCompaniesIds;
    }
}
