package com.bhagirath.bookstore.repositories;

import com.bhagirath.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
