package com.example.projectpaisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectpaisa.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

    public User findByEmail(String email);
}
