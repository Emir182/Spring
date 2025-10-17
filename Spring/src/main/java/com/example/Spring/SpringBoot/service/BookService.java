package com.example.Spring.SpringBoot.service;

import com.example.Spring.SpringBoot.entity.Book;
import com.example.Spring.SpringBoot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    public Book saveBok(Book book) {
        return repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("There is no Book by this id"));
    }

    public void deleteBookById(Long id) {
        repo.deleteById(id);
    }

    public Book updateBook(Long id, Book book) {
        Book bookDB = repo.findById(id).orElseThrow(()-> new RuntimeException(""));


        if(Objects.nonNull(book.getName()) && !"".equalsIgnoreCase(book.getName())){
            bookDB.setName(book.getName());
        }
        bookDB.setName(book.getName());
        bookDB.setCost(book.getCost());
        return repo.save(bookDB);
    }

    public Book getBookByName(String name) {
        return repo.findByName(name);
    }
}
