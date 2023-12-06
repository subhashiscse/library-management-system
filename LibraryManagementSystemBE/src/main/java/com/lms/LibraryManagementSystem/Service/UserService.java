package com.lms.LibraryManagementSystem.Service;

import com.lms.LibraryManagementSystem.Contact.IUserService;
import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository _userRepository;

    @Override
    public User saveUser(User user) {
        return _userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
        return _userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long userId) {
        _userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }

    @Override
    public User getUserByName(String userName){
        return null;
        //return _userRepository.findByName(userName);
    }
}
