package deepshikha.spring.framework.springboot.Bootstrap;

import deepshikha.spring.framework.springboot.Model.Author;
import deepshikha.spring.framework.springboot.Model.Book;
import deepshikha.spring.framework.springboot.Repositories.AuthorRepository;
import deepshikha.spring.framework.springboot.Repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstarp implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    public DevBootstarp(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData(){

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Jhonson");
        Book noEJB = new Book("J2EE Development without EJB","1122", "Worx");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
