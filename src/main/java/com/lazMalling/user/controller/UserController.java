package com.lazMalling.user.controller;


import com.lazMalling.user.model.User;
import com.lazMalling.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody String postUser(@RequestParam String firstName,
                                         @RequestParam String lastName,
                                         @RequestParam String email,
                                         @RequestParam String password,
                                         @RequestParam String mobile,
                                         @RequestParam String role){
        return userService.postUser(firstName,lastName,email,password,mobile,role);
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
    public User updateUserById(@PathVariable long id, @RequestBody User user){
        return userService.updateUserById(id,user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable long id){
        userService.deleteUserById(id);
    }

}
