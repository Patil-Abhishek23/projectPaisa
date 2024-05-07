package com.example.projectpaisa.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectpaisa.entity.User;
import com.example.projectpaisa.repository.MoneyRepository;
import com.example.projectpaisa.service.MoneyService;

@Service
public class MoneyServiceImplimentation implements MoneyService {

    @Autowired
    MoneyRepository moneyRepository;

    @Override
    public User getBalance() {

      User user=new User();
      user.getBalance();      
        return user;
        
    }
}
