package com.example.demo2.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "public")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }
}
