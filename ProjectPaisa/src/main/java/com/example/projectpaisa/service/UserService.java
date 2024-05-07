package com.example.projectpaisa.service;

import com.example.projectpaisa.entity.User;

public interface UserService {

    public String addUser(User user);
    public boolean LoginUsers(String email, String password);

}
