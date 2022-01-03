package com.example.demo2.controller;

import java.util.ArrayList;

import com.example.demo2.model.Author;
import com.example.demo2.model.Book;
import com.example.demo2.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/authors")
    public ArrayList<Author> authors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public Author author(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author) {
        if (author.getName() == "")
            return "Author's name is not specified.";

        // Author author1 = new Author("author1");
        // Author author2 = new Author("author2");
        // List<Author> authors = Arrays.asList(author1, author2);

        // Book book1 = new Book("Book1");
        // Book book2 = new Book("Book2");
        // Book book3 = new Book("Book3");
        // List<Book> books = Arrays.asList(book1, book2, book3);

        // bookMapper.saveAll(books);

        // author1.addBook(book1);
        // author1.addBook(book3);
        // author2.addBook(book2);
        // author2.addBook(book3);

        // authorMapper.saveAll(authors);

        BookController bc = new BookController();
        Book book = bc.book(author.getBookId());

        if (book.getName() == "")
            return "The specified Book Id is not valid.";

        author.addBook(book);
        authorService.addNewAuthor(author);
        
        return "Successfully added into the database.";
    }

    @PutMapping("/updateAuthor")
    public String updateAuthor(@RequestBody Author author) {
        int numUpdated = authorService.updateExistingAuthor(author);
        return numUpdated > 0 ? "Update successful." : "Update failed. Check if your id is correct.";
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable int id) {
        int numDeleted = authorService.deleteExistingAuthor(id);
        return numDeleted > 0 ? "Successfully deleted id " + id + "." : "Id doesn't exist.";
    }
}
