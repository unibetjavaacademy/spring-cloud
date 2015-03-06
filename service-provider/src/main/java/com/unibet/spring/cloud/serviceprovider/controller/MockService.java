package com.unibet.spring.cloud.serviceprovider.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by germanrivas on 06/03/15.
 */
@RestController
@RequestMapping("/service")
public class MockService {
    @Inject
    Environment environment;

    @RequestMapping(method = GET)
    public String service() throws InterruptedException {
        Integer delay = environment.getProperty("service.response.delay", Integer.class);
        Thread.sleep(delay);
        return String.format("Slept during %d", delay);
    }
}
