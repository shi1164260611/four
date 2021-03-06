package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BlogPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogPictureApplication.class, args);
    }

}
