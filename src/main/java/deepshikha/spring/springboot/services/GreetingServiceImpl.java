package deepshikha.spring.springboot.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

public static final String HELLO = "Hello Everyone!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
