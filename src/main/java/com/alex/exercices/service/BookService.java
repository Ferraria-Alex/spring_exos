package com.alex.exercices.service;

import com.alex.exercices.model.Book;
import com.alex.exercices.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public Iterable<Book> findAllBooks() {
        if(bookRepo.count() == 0) {
            return null;
        }
        return bookRepo.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book findBookByTitle(String title) {
        if(bookRepo.count() != 0) {
           Iterator<Book> bookIterator = this.findAllBooks().iterator();
            while(bookIterator.hasNext()){
                Book book = bookIterator.next();
                if(book.getTitle().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }

    public void saveBook(Book book) {
        if(this.findBookByTitle(book.getTitle()) == null) {
            bookRepo.save(book);
        }
    }

    public void updateBookById(Long id, Book book) {
        Optional<Book> findBook = bookRepo.findById(id);
        if(findBook.isPresent()) {
           Book updateBook = findBook.get();
           if(updateBook.getTitle() != null) {
               updateBook.setTitle(book.getTitle());
           }
           if(updateBook.getDescription() != null) {
               updateBook.setDescription(book.getDescription());
           }
           if(updateBook.getPublicationDate() != null) {
               updateBook.setPublicationDate(book.getPublicationDate());
           }
           bookRepo.save(updateBook);
        }
    }

    public void deleteBookById(Long id) {
        if(bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
        }
    }
}
