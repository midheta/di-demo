package io.springframework.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello Gurus!!!! - from GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
