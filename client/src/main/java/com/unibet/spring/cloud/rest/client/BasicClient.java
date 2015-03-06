package com.unibet.spring.cloud.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: marols
 * Date: 05/03/2015
 * Time: 13:39
 */
//@Configuration
//@EnableAutoConfiguration
//@EnableEurekaClient
//@RestController
@EnableAutoConfiguration
@ComponentScan
@EnableDiscoveryClient
@RestController
public class BasicClient {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(BasicClient.class).web(true).run(args);
//        SpringApplication.run(BasicClient.class, args);
    }
}
