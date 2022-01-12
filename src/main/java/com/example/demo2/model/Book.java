package com.example.demo2.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "public")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }
}
