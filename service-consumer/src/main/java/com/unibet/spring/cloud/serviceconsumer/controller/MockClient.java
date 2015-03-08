package com.unibet.spring.cloud.serviceconsumer.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by germanrivas on 06/03/15.
 */
@RestController
@RequestMapping("/service")
public class MockClient {


    @Inject
    DiscoveryClient discoveryClient;

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(method = GET)
    public String service() throws InterruptedException {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        if (!instances.isEmpty()){
            return restTemplate.getForObject(instances.get(0).getUri(), String.class);
        }
        throw new RuntimeException("Service provider not available");
    }
}
