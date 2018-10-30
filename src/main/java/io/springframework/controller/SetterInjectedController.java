package io.springframework.controller;

import io.springframework.service.GreetingService;

public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
