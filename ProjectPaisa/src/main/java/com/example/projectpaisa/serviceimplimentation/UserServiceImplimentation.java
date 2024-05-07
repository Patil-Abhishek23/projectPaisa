package com.example.projectpaisa.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.projectpaisa.entity.User;
import com.example.projectpaisa.repository.UserRepository;
import com.example.projectpaisa.service.UserService;

@Service
public class UserServiceImplimentation implements UserService {

    @Autowired
    UserRepository userRepository;

    @SuppressWarnings("null")
    public String addUser(@ModelAttribute User user) {
		userRepository.save(user);
		return "User added sucessfully";
	}


    public boolean emailExists(String email) {
		if (userRepository.findByEmail(email) != null) {
			return true;
		}

		else {
			return false;

		}
	}
    
    public boolean LoginUsers(String email, String password) {
        User  user=userRepository.findByEmail(email);
        String dbpass=user.getPassword();
        if(password.equals(dbpass)){
            return true;
        }
        else{

            return false;
       }
    }

}
