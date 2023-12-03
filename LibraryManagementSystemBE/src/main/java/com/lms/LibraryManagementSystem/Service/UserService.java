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
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll().stream().toList();
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }

    @Override
    public User fetchUserByName(String userName) {
        return null;
    }
    /*@Override
    public User fetchUserById(Long userId) throws UserNotFoundException {
        Optional<User> department =
                userRepositoryRepository.findById(userId);

        if(!department.isPresent()) {
            throw new UserNotFoundException("Department Not Available");
        }

        return  department.get();
    }*/
}
