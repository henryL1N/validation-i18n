package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Henry Lin badcop@163.com
 */
@RestController
@RequestMapping("/api")
public class BookResource {

    private BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    Book save(@Valid @RequestBody Book book) {
        return bookService.save(book);
    }
}
