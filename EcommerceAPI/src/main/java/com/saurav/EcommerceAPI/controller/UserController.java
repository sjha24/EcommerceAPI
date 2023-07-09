package com.saurav.EcommerceAPI.controller;
import com.saurav.EcommerceAPI.model.User;
import com.saurav.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUsers(@RequestBody List<User> usersList){
        return userService.addUsers(usersList);
    }

    @GetMapping("/id/{userID}")
    public Optional<User> getUserById(@PathVariable Integer userID){
        return userService.getUserById(userID);
    }
}
