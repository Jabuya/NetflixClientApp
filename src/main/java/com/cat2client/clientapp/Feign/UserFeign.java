package com.cat2client.clientapp.Feign;

import com.cat2client.clientapp.FeignConfig;
import com.cat2client.clientapp.Models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user",url = "https://mock-netflix-api.herokuapp.com", configuration = FeignConfig.class)
public interface UserFeign {
    @RequestMapping(method = RequestMethod.POST, value = "users")
    User newUser(@RequestBody User user);
}
