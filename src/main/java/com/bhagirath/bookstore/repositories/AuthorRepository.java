package com.bhagirath.bookstore.repositories;

import com.bhagirath.bookstore.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
