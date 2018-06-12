package com.bhagirath.bookstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Author {

    private Long id;
    private String firstName;
    private String lastName;
}
