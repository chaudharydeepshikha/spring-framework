package deepshikha.spring.springboot.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - English";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Amigos - Spanish";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - German";
    }
}
