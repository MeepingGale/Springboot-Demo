// package com.example.demo2.model;

// import java.util.*; 

// import javax.persistence.*;

// @Entity
// @Table(name="author", schema = "public")
// public class Author {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id")
//     private Long id;
//     @Column(name = "name")
//     private String name;
//     private int bookId;

//     @ManyToMany
//     @JoinTable(
//         name = "author_books",
//         schema = "public",
//         joinColumns =  @JoinColumn(name = "author_id"),
//         inverseJoinColumns = @JoinColumn(name = "book_id")
//     )
//     private List<Book> bookList = new ArrayList<>();

//     // public Author(String name) {
//     //     this.name = name;
//     // }

//     // public Author(String name, int bookId) {
//     //     this.name = name;
//     //     this.bookId = bookId;
//     // }

//     public Long getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public Integer getBookId() {
//         return bookId;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void addBook(Book book) {
//         bookList.add(book);
//     }

//     public void setBookId(Integer bookId) {
//         this.bookId = bookId;
//     }
// }
