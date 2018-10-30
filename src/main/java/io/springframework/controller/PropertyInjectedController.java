package io.springframework.controller;

import io.springframework.service.GreetingServiceImpl;


/**
 * DI TYPE: NOT TO DO
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

}
