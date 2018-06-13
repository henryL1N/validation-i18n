package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * @author Henry Lin badcop@163.com
 */
@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    Book save(Book book) {
        return bookRepository.save(book);
    }

}
