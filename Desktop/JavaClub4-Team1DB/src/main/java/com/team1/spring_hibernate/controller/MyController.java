package com.team1.spring_hibernate.controller;

import com.team1.spring_hibernate.entity.User;
import com.team1.spring_hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/main")
    public String showAllUsers(Model model){
        List<User> allUsers = userService.getAllUser();
        model.addAttribute("modelAllUsers", allUsers);
        return "all_users";
    }

}
