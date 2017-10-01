package deepshikha.spring.springboot.config;

import deepshikha.spring.springboot.ExampleBeans.FakeDataSource;
import deepshikha.spring.springboot.ExampleBeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Deepshikha Chaudhary
 */
@Configuration
public class propertyConfig {

    @Value("${didemo.username}")
    String username;

    @Value("${didemo.password}")
    String password;

    @Value("${didemo.dburl}")
    String dburl;

    @Value("${jms.username}")
    String jmsUsername;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.dburl}")
    String jmsDbUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource  dataSource = new FakeDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDburl(dburl);

        return dataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker jmsBroker = new FakeJMSBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setDburl(jmsDbUrl);

        return jmsBroker;
    }
}
