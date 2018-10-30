package io.springframework.controller;

import io.springframework.service.GreetingService;

public class ConstructorInjectedController {

    public GreetingService greetingService;

   public ConstructorInjectedController(GreetingService greetingService)
   {
       this.greetingService = greetingService;
   }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
