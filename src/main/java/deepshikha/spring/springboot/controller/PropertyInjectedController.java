package deepshikha.spring.springboot.controller;

import deepshikha.spring.springboot.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
      return greetingService.sayGreeting();
    }
}
