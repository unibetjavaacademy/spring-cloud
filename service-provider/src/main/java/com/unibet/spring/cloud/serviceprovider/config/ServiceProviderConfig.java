package com.unibet.spring.cloud.serviceprovider.config;

import com.unibet.spring.cloud.serviceprovider.controller.MockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
public class ServiceProviderConfig {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceProviderConfig.class).web(true).run(args);
    }

    @Bean
    public MockService mockService(){
        return new MockService();
    }
}
