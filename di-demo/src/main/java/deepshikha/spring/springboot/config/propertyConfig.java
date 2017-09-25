package deepshikha.spring.springboot.config;

import deepshikha.spring.springboot.ExampleBeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Deepshikha Chaudhary
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class propertyConfig {

    @Value("${didemo.username}")
    String username;

    @Value("${didemo.password}")
    String password;

    @Value("${didemo.dburl}")
    String dburl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource  dataSource = new FakeDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDburl(dburl);

        return dataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
