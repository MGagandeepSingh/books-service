package me.gagan.service.controller;

import me.gagan.service.document.Book;
import me.gagan.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/")
public class BookController {

    private BookService bookService;

    @GetMapping("book")
    public Flux<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
