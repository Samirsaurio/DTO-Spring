package com.example.practice.exception;


import com.example.practice.model.User;
import com.example.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    UserRepository userRepository;


}
