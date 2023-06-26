package com.example.practice.model;

public class UserDTO {

    public UserDTO(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public UserDTO() {}

    private String username;
    private String name;

    // Constructor, getters, and setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}