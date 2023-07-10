package com.example.turbineeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TurbineEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineEurekaServiceApplication.class, args);
    }

}
