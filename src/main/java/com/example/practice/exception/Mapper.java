package com.example.practice.exception;

import com.example.practice.model.User;
import com.example.practice.model.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapper {

    public UserDTO toDto(User user) {
        String username = user.getUsername();
        String name = user.getName();

        return new UserDTO(name, username);
    }
}
