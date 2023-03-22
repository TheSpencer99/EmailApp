package org.semicolon.africa.EmailApp.Data.Repositories;

import org.semicolon.africa.EmailApp.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
//    User save(User user);
//
//    int count();
//
    User findByFirstName(String firstName);
    User findByLastName(String lastName);

    User findByEmailAddress(String emailAddress);
//
//    int size();
//
//    void deleteByFirstName(String firstName);
//

    Optional<User> findById(String id);




}

