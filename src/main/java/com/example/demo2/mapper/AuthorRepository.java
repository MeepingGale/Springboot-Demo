package com.example.demo2.mapper;

import com.example.demo2.model.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
    
}