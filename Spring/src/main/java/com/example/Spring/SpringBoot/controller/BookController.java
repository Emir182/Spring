package com.example.Spring.SpringBoot.controller;


import com.example.Spring.SpringBoot.entity.Book;
import com.example.Spring.SpringBoot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book){
        return service.saveBok(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id){
        return service.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable Long id){
        service.deleteBookById(id);
        return "The book was successfully deleted";
    }

    @PutMapping("Book/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return service.updateBook(id, book);
    }
    @GetMapping("/book/{name}")
    public Book getBookByName(@PathVariable String name){
        return service.getBookByName(name);
    }
}
