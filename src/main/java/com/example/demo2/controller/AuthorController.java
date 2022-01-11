// package com.example.demo2.controller;

// import java.util.ArrayList;

// import com.example.demo2.model.Author;
// import com.example.demo2.model.Book;
// import com.example.demo2.service.AuthorService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// public class AuthorController {

//     @Autowired
//     AuthorService authorService;

//     @GetMapping("/authors")
//     public ArrayList<Author> authors() {
//         return authorService.getAllAuthors();
//     }

//     @GetMapping("/author/{id}")
//     public Author author(@PathVariable int id) {
//         return authorService.getAuthorById(id);
//     }

//     @PostMapping("/addAuthor")
//     public String addAuthor(@RequestBody Author author) {
//         if (author.getName() == "")
//             return "Author's name is not specified.";

//         BookController bc = new BookController();
//         Book book = bc.book(author.getBookId());

//         if (book.getName() == "")
//             return "The specified Book Id is not valid.";

//         author.addBook(book);
//         authorService.addNewAuthor(author);
        
//         return "Successfully added into the database.";
//     }

//     @PutMapping("/updateAuthor")
//     public String updateAuthor(@RequestBody Author author) {
//         int numUpdated = authorService.updateExistingAuthor(author);
//         return numUpdated > 0 ? "Update successful." : "Update failed. Check if your id is correct.";
//     }

//     @DeleteMapping("/deleteAuthor/{id}")
//     public String deleteAuthor(@PathVariable int id) {
//         int numDeleted = authorService.deleteExistingAuthor(id);
//         return numDeleted > 0 ? "Successfully deleted id " + id + "." : "Id doesn't exist.";
//     }
// }
