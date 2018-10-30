package io.springframework;

import io.springframework.controller.PropertyInjectedController;
import io.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProperyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup()
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
