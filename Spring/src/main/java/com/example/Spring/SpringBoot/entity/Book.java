package com.example.Spring.SpringBoot.entity;


import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Setter
    @Getter
    private String name;
    @Getter
    @Setter
    private double cost;

    public Book(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    public Book(){}

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
