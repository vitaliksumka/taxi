package com.team1.spring_hibernate.controller;

import com.team1.spring_hibernate.entity.Book;
import com.team1.spring_hibernate.entity.BookAuthor;
import com.team1.spring_hibernate.entity.User;
import com.team1.spring_hibernate.service.BookAuthorService;
import com.team1.spring_hibernate.service.BookService;
import com.team1.spring_hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
public class MyController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;
    @Autowired
    private BookAuthorService bookAuthorService;

    @RequestMapping("/users")
    public String showAllUsers(Model model){
        List<User> allUsers = userService.getAllUser();
        model.addAttribute("modelAllUsers", allUsers);
        return "all_users";
    }

    @RequestMapping("/books")
    public String showAllBooks(Model model){
        List<Book> allBook = bookService.getAllBook();
        model.addAttribute("modelAllBooks", allBook);
        return "all_book";
    }

    @RequestMapping("/booksAndAuthors")
    public String showBooksAndAuthors(Model model){
        List<BookAuthor> allBookAndAuthors = bookAuthorService.getAllBookAuthor();
        model.addAttribute("bookAndAuthors", allBookAndAuthors);
        return "page_bookAndAuthors";
    }



}
