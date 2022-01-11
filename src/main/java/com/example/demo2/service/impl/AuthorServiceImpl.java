// package com.example.demo2.service.impl;

// import java.util.ArrayList;

// import com.example.demo2.mapper.AuthorMapper;
// import com.example.demo2.model.Author;
// import com.example.demo2.service.AuthorService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service("AuthorServiceImpl")
// public class AuthorServiceImpl implements AuthorService {

//     @Autowired
//     AuthorMapper authorMapper;
    
//     @Override
//     public ArrayList<Author> getAllAuthors() {
//         return authorMapper.getAllAuthors();
//     }

//     @Override
//     public Author getAuthorById(int id) {
//         return authorMapper.getAuthorById(id);
//     }

//     @Override
//     public int addNewAuthor(Author author) {
//         return authorMapper.addNewAuthor(author);
//     }

//     @Override
//     public int updateExistingAuthor(Author author) {
//         return authorMapper.updateExistingAuthor(author);
//     }

//     @Override
//     public int deleteExistingAuthor(int id) {
//         return authorMapper.deleteExistingAuthor(id);
//     }
    
// }
