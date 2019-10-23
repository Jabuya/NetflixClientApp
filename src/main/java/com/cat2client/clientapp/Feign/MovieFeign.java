package com.cat2client.clientapp.Feign;

import com.cat2client.clientapp.FeignConfig;
import com.cat2client.clientapp.Models.CreateMovieDto;
import com.cat2client.clientapp.Models.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "movies",url = "https://mock-netflix-api.herokuapp.com", configuration = FeignConfig.class)
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.POST, value = "movies")
    Movie newMovie(@RequestHeader("id-number") String idNumber, @RequestBody CreateMovieDto movie);

    @RequestMapping(method = RequestMethod.PUT, value = "movies/{id}")
    Movie updateMovie(@PathVariable(name="id")Long id);

    @RequestMapping(method = RequestMethod.DELETE, value = "companies/{id}")
    Movie deleteMovie(@RequestBody Movie movie);
}
