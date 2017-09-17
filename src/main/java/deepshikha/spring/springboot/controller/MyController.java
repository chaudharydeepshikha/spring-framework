package deepshikha.spring.springboot.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello from controller!");
        return "foo";
    }
}
