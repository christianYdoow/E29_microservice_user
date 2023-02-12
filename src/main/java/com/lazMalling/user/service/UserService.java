package com.lazMalling.user.service;

import com.lazMalling.user.model.User;
import com.lazMalling.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;



    public ResponseEntity<HttpStatus> postUser(User user){
         userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(long id){
        return  userRepository.findById(id);
    }

    public ResponseEntity<HttpStatus> updateUserById(long id,User user){
        user.setId(id);
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteUserById(long id){

        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
