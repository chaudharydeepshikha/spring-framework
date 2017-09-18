package deepshikha.spring.springboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from Primary greeting Implementation";
    }
}
