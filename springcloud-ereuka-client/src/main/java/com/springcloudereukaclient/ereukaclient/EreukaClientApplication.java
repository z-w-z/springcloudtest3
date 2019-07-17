package com.springcloudereukaclient.ereukaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EreukaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EreukaClientApplication.class, args);
    }

}
