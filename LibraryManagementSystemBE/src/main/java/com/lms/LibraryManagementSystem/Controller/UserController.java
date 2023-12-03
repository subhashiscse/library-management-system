package com.lms.LibraryManagementSystem.Controller;

import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {
    @Autowired
    UserService _userService;

    public UserController(UserService userService) {
        _userService = userService;
    }

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return _userService.saveUser(user);
    }
    @GetMapping("/getUsers")
    public List<User> getUserList(){
        return _userService.getUserList();
    }
}
