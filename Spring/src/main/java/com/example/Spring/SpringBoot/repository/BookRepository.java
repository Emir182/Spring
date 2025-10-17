package com.example.Spring.SpringBoot.repository;

import com.example.Spring.SpringBoot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.name = :name")
    public Book findByName(String name);
}
