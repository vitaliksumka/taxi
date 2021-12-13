package com.team1.spring_hibernate.entity;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "role_id")
    private int roleId;

    // --------------------------------------------------------------

    @OneToMany(mappedBy = "user")
    private Set<BookLoan> bookLoans = new HashSet<BookLoan>();


    @OneToMany(mappedBy = "user")  // тут було закоментовано, розкоментував!!!
    public Set<BookLoan> getBookLoans() {
        return bookLoans;
    }

    public void setBookLoans(Set<BookLoan> bookLoans) {
        this.bookLoans = bookLoans;
    }

//    public void setBookAuthor(Set<BookAuthor> bookAuthor) {
//        this.bookAuthors = bookAuthors;
//    }

    public void addBookLoan(BookLoan bookLoan) {
        this.bookLoans.add(bookLoan);
    }

    public void addLoan(BookLoan bookLoan) {
        this.bookLoans.add(bookLoan);
    }

    // --------------------------------------------------------------


    public User() {
    }

    public User(int id, String name, String surname, int age, int role_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.roleId = role_id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
