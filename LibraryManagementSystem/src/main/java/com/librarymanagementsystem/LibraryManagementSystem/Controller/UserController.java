package com.librarymanagementsystem.LibraryManagementSystem.Controller;

import com.librarymanagementsystem.LibraryManagementSystem.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/GetUserData")
    public User GetUserName(){
        return new User("Subhasihs","smollickcseiu@gmail.com");
    }
}
