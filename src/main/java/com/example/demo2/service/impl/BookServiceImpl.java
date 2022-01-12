package com.example.demo2.service.impl;

import java.util.ArrayList;

import com.example.demo2.mapper.BookMapper;
import com.example.demo2.model.Book;
import com.example.demo2.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BookServiceImpl")
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public ArrayList<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public int addNewBook(Book book) {
        return bookMapper.addNewBook(book);
    }

    @Override
    public int updateExistingBook(Book book) {
        return bookMapper.updateExistingBook(book);
    }

    @Override
    public int deleteExistingBook(int id) {
        return bookMapper.deleteExistingBook(id);
    }
    
}