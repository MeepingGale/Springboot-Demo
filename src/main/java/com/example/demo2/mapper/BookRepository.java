package com.example.demo2.mapper;

import com.example.demo2.model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
    
}
