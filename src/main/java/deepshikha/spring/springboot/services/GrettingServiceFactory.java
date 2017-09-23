package deepshikha.spring.springboot.services;

public class GrettingServiceFactory {

    private GreetingRepository greetingRepository;

    public GrettingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String language){

        switch(language){
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }
    }
}
