package org.semicolon.africa.EmailApp.Data.Repositories;

import org.semicolon.africa.EmailApp.Data.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class UserRepositoryImpl implements UserRepository {
//
//    private List<User> users = new ArrayList<>();
//    private int count;
//
//
//
//    @Override
//    public User save(User user) {
//        users.add(user);
//        count++;
//        return user;
//    }
//
//    @Override
//    public int count() {
//        return count;
//    }
//
//    @Override
//    public User findUserByFirstName(String firstName) {
//        for (User user : users) {
//            if (Objects.equals(user.getFirstName(), firstName)) {
//                return user;
//            }
//        }
//
//        return null;
//    }
//
//    @Override
//    public int size() {
//        return users.size();
//    }
//
//    @Override
//    public void deleteByFirstName(String firstName) {
////        for (User user: users){
////            if(user.getFirstName() == firstName){
////                users.remove(user);
////            }
////
////        }
//        User foundUser = findUserByFirstName(firstName);
//        users.remove(foundUser);
//
//
//    }
//
//    @Override
//    public User findUserByLastName(String LastName) {
//        for (User user : users) {
//            if (Objects.equals(user.getLastName(), LastName)) {
//                return user;
//            }
//        }
//        return null;
//    }
//}



