package com.example.eurekaaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAwsApplication.class, args);
    }

}
