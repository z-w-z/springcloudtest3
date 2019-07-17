package com.commonuser.commonuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonUserApplication.class, args);
    }

}
