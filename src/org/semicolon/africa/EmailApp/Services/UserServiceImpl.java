package org.semicolon.africa.EmailApp.Services;

import org.semicolon.africa.EmailApp.Data.Models.User;
import org.semicolon.africa.EmailApp.Data.Repositories.UserRepository;
import org.semicolon.africa.EmailApp.dtos.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    public User Register(RegisterRequest registerRequest) {
        User user = new User();
        user.setLastName(registerRequest.getLastname());
        user.setFirstName(registerRequest.getFirstName());
        user.setEmailAddress(registerRequest.getEmailAddress());
        user.setPassword(registerRequest.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User findByEmailAddress(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress);
    }

    @Override
    public long count() {
        return userRepository.count();
    }



    @Override
    public User findUserByFirstName(String firstName) {

        return userRepository.findByFirstName(firstName);
    }

    @Override
    public User findUserByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    @Override
    public User findById(String Id) {
        return userRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }
}
