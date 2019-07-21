package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    //@Qualifier("library 2")

    @Bean//(name="library 2")
    public Library library() {
        return new Library(libraryDbController());
    }

    @Bean//(name="library Db Controller 2")
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}