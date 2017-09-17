package deepshikha.spring.springboot.controller;

import deepshikha.spring.springboot.services.GreetingService;

public class GetterInjectedController {
     private GreetingService greetingService;

     String sayHello(){
         return greetingService.sayGreeting();
     }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
