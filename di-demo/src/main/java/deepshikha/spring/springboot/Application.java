package deepshikha.spring.springboot;

import deepshikha.spring.springboot.controller.ConstructorInjectedController;
import deepshikha.spring.springboot.controller.GetterInjectedController;
import deepshikha.spring.springboot.controller.MyController;
import deepshikha.spring.springboot.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(GetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
