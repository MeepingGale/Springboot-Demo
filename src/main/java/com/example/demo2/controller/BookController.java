package com.example.demo2.controller;

import java.util.ArrayList;

import com.example.demo2.model.Book;
import com.example.demo2.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ArrayList<Book> books() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book book(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book author) {
        if (author.getName() == "")
            return "Book's name is not specified.";
        bookService.addNewBook(author);
        return "Successfully added into the database.";
    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book author) {
        int numUpdated = bookService.updateExistingBook(author);
        return numUpdated > 0 ? "Update successful." : "Update failed. Check if your id is correct.";
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        int numDeleted = bookService.deleteExistingBook(id);
        return numDeleted > 0 ? "Successfully deleted id " + id + "." : "Id doesn't exist.";
    }
}
