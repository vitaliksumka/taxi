package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "nationality_id")
    private int nationality_id;

    @Column(name = "age")
    private int age;


    // --------------------------------------------------------------

    @OneToMany(mappedBy = "author")
    private Set<BookAuthor> bookAuthors = new HashSet<BookAuthor>();


    @OneToMany(mappedBy = "author")  // тут було закоментовано, розкоментував!!!
    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

//    public void setBookAuthor(Set<BookAuthor> bookAuthor) {
//        this.bookAuthors = bookAuthors;
//    }

    public void addBookAuthor(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    public void addGroup(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    // --------------------------------------------------------------



//    @ManyToMany
//    @JoinTable(
//            name = "book_author",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"))
//    Set<Book> writtenBooks;


    public Author() {
    }

    public Author(int id, String name, String surname, int nationality_id, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationality_id = nationality_id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(int nationality_id) {
        this.nationality_id = nationality_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }













}
