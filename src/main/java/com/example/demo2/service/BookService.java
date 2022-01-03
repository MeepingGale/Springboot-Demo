package com.example.demo2.service;

import java.util.ArrayList;

import com.example.demo2.model.Book;

public interface BookService {
    ArrayList<Book> getAllBooks();
    Book getBookById(int id);
    int addNewBook(Book book);
    int updateExistingBook(Book book);
    int deleteExistingBook(int id);
}
