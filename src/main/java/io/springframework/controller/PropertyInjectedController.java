package io.springframework.controller;

import io.springframework.service.GreetingService;
import io.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * DI TYPE: NOT TO DO
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier(value = "greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

}
