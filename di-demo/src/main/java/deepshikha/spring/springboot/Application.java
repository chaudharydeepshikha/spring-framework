package deepshikha.spring.springboot;

import deepshikha.spring.springboot.ExampleBeans.FakeDataSource;
import deepshikha.spring.springboot.ExampleBeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDburl());

		FakeJMSBroker fakeJMSBroker = context.getBean(FakeJMSBroker.class);
		System.out.println(fakeJMSBroker.getUsername());
		System.out.println(fakeJMSBroker.getPassword());
		System.out.println(fakeJMSBroker.getDburl());
	}
}
