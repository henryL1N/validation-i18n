package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Henry Lin badcop@163.com
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
