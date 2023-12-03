package com.lms.LibraryManagementSystem.Contact;

import com.lms.LibraryManagementSystem.Entity.User;

import java.util.*;

public interface IUserService {
    public User saveUser(User user);

    public List<User> getUserList();

    //public User fetchUserById(Long userId) throws UserNotFoundException;

    public void deleteUserById(Long userId);

    public User updateUser(Long userId, User user);

    User fetchUserByName(String userName);
}
