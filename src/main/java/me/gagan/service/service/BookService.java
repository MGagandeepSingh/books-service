package me.gagan.service.service;

import me.gagan.service.document.Book;
import me.gagan.service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BookService {

    private BookRepository repository;

    public Flux<Book> getAllBooks() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }
}
