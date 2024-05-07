package com.example.projectpaisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.projectpaisa.entity.User;
import com.example.projectpaisa.serviceimplimentation.UserServiceImplimentation;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserServiceImplimentation serviceImpl;

    @GetMapping("/register")
    public String arrbhai(){
        return "register";
    }

    @PostMapping("/register")
	public String addUser(@ModelAttribute User user) {

	
		String email = user.getEmail();

		boolean status = serviceImpl.emailExists(email);

		if (status == false) {
			serviceImpl.addUser(user);
			System.out.println("User added");

		} else {

			System.out.println("User already exists");
			return "register";

		}

		return "login";
	}

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
        
    @PostMapping("/validate")
    public String LoginUser(@RequestParam("email") String email, @RequestParam("password") String password){
         if (serviceImpl.LoginUsers(email, password) == true){
            return "userpage";
     }
       else{
            return "wrongcreds";
       }

    }

	@GetMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "login";
	}

   
}
