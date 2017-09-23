package deepshikha.spring.springboot.config;

import deepshikha.spring.springboot.services.GreetingRepository;
import deepshikha.spring.springboot.services.GreetingService;
import deepshikha.spring.springboot.services.GrettingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class greetingServiceConfig {

    @Bean
    GrettingServiceFactory grettingServiceFactory(GreetingRepository greetingRepository){
        return new GrettingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    GreetingService primaryGreetingService(GrettingServiceFactory factory){
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService primarySpanishGreetingService(GrettingServiceFactory factory){
        return factory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanGreetingService(GrettingServiceFactory factory){
        return factory.createGreetingService("de");
    }
}
