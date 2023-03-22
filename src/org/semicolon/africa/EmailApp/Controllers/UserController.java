package org.semicolon.africa.EmailApp.Controllers;

import org.semicolon.africa.EmailApp.Services.UserService;
import org.semicolon.africa.EmailApp.Services.UserServiceImpl;
import org.semicolon.africa.EmailApp.dtos.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

@PostMapping("/user/register")
    public Object register(@RequestBody RegisterRequest registerRequest){
        try{
            return new ResponseEntity<>(userService.Register(registerRequest), HttpStatus.CREATED);
        } catch(IllegalArgumentException ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
    @GetMapping("/user/findUser/{lastName}")
    public ResponseEntity<?> findUserByLastName(@PathVariable String lastName){
    try{
        System.out.println("I am here");
        return new ResponseEntity<>(userService.findUserByLastName(lastName), HttpStatus.FOUND);
    } catch (IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    }
    @GetMapping("/user/{Id}")
    public Object findById(@PathVariable String Id){
    try{
        return new ResponseEntity<>(userService.findById(Id), HttpStatus.FOUND);
    }catch (IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    }
    @GetMapping("/userEmailAddress/{emailAddress}")
    public ResponseEntity<?> findByEmailAddress(@PathVariable String emailAddress){
    try{
    return new ResponseEntity<>(userService.findByEmailAddress(emailAddress), HttpStatus.FOUND);
    }catch (IllegalArgumentException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    }
}
