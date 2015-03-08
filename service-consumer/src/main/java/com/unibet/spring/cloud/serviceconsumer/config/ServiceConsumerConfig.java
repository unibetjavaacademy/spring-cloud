package com.unibet.spring.cloud.serviceconsumer.config;

import com.unibet.spring.cloud.serviceconsumer.controller.MockClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
public class ServiceConsumerConfig {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceConsumerConfig.class).web(true).run(args);
    }

    @Bean
    public MockClient mockService(){
        return new MockClient();
    }
}
