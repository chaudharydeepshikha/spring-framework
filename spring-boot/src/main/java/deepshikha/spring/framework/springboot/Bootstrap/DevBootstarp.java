package deepshikha.spring.framework.springboot.Bootstrap;

import deepshikha.spring.framework.springboot.Model.Author;
import deepshikha.spring.framework.springboot.Model.Book;
import deepshikha.spring.framework.springboot.Model.Publisher;
import deepshikha.spring.framework.springboot.Repositories.AuthorRepository;
import deepshikha.spring.framework.springboot.Repositories.BookRepository;
import deepshikha.spring.framework.springboot.Repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstarp implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstarp(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("ABC publisher");
        publisher.setAddress("Address of ABC");

        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Jhonson");
        Book noEJB = new Book("J2EE Development without EJB","1122", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
