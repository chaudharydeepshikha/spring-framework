package deepshikha.spring.springboot;

import deepshikha.spring.springboot.ExampleBeans.FakeDataSource;
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

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDburl());
	}
}
