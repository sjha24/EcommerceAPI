package com.saurav.EcommerceAPI.service;

import com.saurav.EcommerceAPI.model.User;
import com.saurav.EcommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String addUsers(List<User> usersList) {
        if(usersList !=null){
            userRepo.saveAll(usersList);
            return "User list added successful";
        }
        return "Not added !!!";
    }

    public Optional<User> getUserById(Integer userID) {
        if(userID != null){
            return userRepo.findById(userID);
        }
        return null;
    }
}
