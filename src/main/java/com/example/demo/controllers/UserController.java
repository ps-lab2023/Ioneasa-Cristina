package com.example.demo.controllers;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

   @PutMapping("/updatePassword")
    public User updatePassword(@RequestBody User user){
       return userService.updateUser(user, user.getPassword());
   }
}
