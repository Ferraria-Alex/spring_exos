package com.alex.exercices.controller;

import com.alex.exercices.model.Book;
import com.alex.exercices.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Iterable<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return Optional.ofNullable(bookService.findBookById(id));
    }

    @PostMapping("/books/add")
    public void addBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @PutMapping("/books/update/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBookById(id, book);
    }

    @DeleteMapping("/books/delete/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
}
