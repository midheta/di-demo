package io.springframework;

import io.springframework.controller.SetterInjectedController;
import io.springframework.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup()
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
