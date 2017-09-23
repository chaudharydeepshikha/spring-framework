package deepshikha.spring.springboot.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {

        return "This message is from Constructor-service-implementation";
    }
}
