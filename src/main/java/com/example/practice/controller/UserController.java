package com.example.practice.controller;

import com.example.practice.exception.Mapper;
import com.example.practice.model.User;
import com.example.practice.model.UserDTO;
import com.example.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/usersdto")
    @ResponseBody
    List<UserDTO> getAllUsersDTO(){
        return userRepository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/usersmapping/{id}")
    Optional<UserDTO> getUserById(@PathVariable Long id){
        return userRepository.findById(id).map(mapper::toDto);
    }
}
