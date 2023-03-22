package org.semicolon.africa.EmailApp.Services;

import org.semicolon.africa.EmailApp.Data.Models.User;
import org.semicolon.africa.EmailApp.dtos.RegisterRequest;

import java.util.Optional;


public interface UserService {
    User Register(RegisterRequest registerRequest);

    User findByEmailAddress(String emailAddress);

    long count();

    User findUserByFirstName(String firstName);

    User findUserByLastName(String almighty);

    User findById(String Id);
}
