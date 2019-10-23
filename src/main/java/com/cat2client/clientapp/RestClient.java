package com.cat2client.clientapp;

import com.cat2client.clientapp.Feign.MovieFeign;
import com.cat2client.clientapp.Feign.ProductionCompanyFeign;
import com.cat2client.clientapp.Feign.UserFeign;
import com.cat2client.clientapp.Models.Category;
import com.cat2client.clientapp.Models.Movie;
import com.cat2client.clientapp.Models.ProductionCompany;
import com.cat2client.clientapp.Models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestClient implements CommandLineRunner {
    private UserFeign userFeign;
    private ProductionCompanyFeign companyFeign;
    private MovieFeign movieFeign;

    public RestClient(UserFeign userFeign, ProductionCompanyFeign companyFeign, MovieFeign movieFeign) {
        this.userFeign = userFeign;
        this.companyFeign = companyFeign;
        this.movieFeign = movieFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        //adding a new user
        User add_user = userFeign.newUser(new User("Wesley Jabuya", "1234"));

        //adding a new production company
        ProductionCompany add_company = companyFeign.newProductionCompany(new ProductionCompany("Paramount Picture"));

        //updating a production company details
       add_company.setName("Paramount Studio");
       ProductionCompany update_company = companyFeign.update_company(add_company.getId(), add_company);

       //deleting a production company
       ProductionCompany deleteCompany = companyFeign.delete_company(update_company.getId());

       //adding a new movie
        Category cat = new Category("Action");
        ProductionCompany prodCompany = new ProductionCompany("Universal");
        User onlineUser = new User("Joy", "1256");
        Movie add_movie = movieFeign.newMovie(new Movie("Hobbs and Shaw", "Action", 0, "Original", "Paramount Studio", "123"));
    }
}
