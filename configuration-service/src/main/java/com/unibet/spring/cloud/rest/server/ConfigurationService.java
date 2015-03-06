package com.unibet.spring.cloud.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: marols
 * Date: 05/03/2015
 * Time: 14:29
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigurationService {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationService.class, args);
    }

}
