package com.cat2client.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class ClientappApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientappApplication.class, args);
    }
}
