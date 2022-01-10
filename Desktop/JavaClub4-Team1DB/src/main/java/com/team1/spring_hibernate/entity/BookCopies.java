package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Table (name = "book_copies")
public class BookCopies {

    //many to one
    private Book book;



//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



//    @OneToMany
//    @JoinColumn(name="book_id")
//    private Set<BookCopies> bookCopies = new HashSet<BookCopies>();


//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }



    //@Column(name = "is_available")
    private int is_available;

    public BookCopies() {

    }

    public BookCopies(int id, int is_available) {
        this.id = id;
        this.is_available = is_available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_available() {
        return is_available;
    }

    public void setIs_available(int is_available) {
        this.is_available = is_available;
    }
}


