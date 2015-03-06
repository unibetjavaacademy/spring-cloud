package com.unibet.spring.cloud.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: marols
 * Date: 05/03/2015
 * Time: 09:29
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class DiscoveryService {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryService.class, args);
    }
}
