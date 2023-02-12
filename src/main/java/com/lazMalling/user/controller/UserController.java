package com.lazMalling.user.controller;


import com.lazMalling.user.model.User;
import com.lazMalling.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public @ResponseBody ResponseEntity<HttpStatus> postUser(@RequestBody User user){
        return userService.postUser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
    @PutMapping("/users/{id}")
    public ResponseEntity<HttpStatus> updateUserById(@PathVariable long id, @RequestBody User user){
        return userService.updateUserById(id,user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable long id){
       return  userService.deleteUserById(id);
    }

}
