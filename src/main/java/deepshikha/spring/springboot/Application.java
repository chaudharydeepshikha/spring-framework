package deepshikha.spring.springboot;

import deepshikha.spring.springboot.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) context.getBean("myController");

		myController.hello();
	}
}
