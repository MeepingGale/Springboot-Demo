package com.example.demo2.model;

import java.util.*; 

import javax.persistence.*;

@Entity
@Table(name="author", schema = "public")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany
    @JoinTable(
        name = "author_books",
        schema = "public",
        joinColumns =  @JoinColumn(name = "author_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> bookList = new ArrayList<>();

    public Author(String name) {
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

    public void addBook(Book book) {
        bookList.add(book);
    }
}
