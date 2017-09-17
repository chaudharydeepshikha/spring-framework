package deepshikha.spring.springboot.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {

        return "This message is from Getter-service-implementation";
    }
}
