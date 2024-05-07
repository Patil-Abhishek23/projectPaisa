package com.example.projectpaisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.projectpaisa.entity.User;
import com.example.projectpaisa.service.MoneyService;
import com.example.projectpaisa.serviceimplimentation.MoneyServiceImplimentation;

@Controller
public class MoneyController {

    @Autowired
    MoneyServiceImplimentation moneyServiceImplimentation;
    
    @Autowired
    MoneyService moneyService;

    @GetMapping("/balance")
    public String showMoney(Model model) {

       User user=moneyServiceImplimentation.getBalance();

       model.addAttribute("user", user);
        return "balance";

    }   
}
