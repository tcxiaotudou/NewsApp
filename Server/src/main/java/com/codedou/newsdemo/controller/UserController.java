package com.codedou.newsdemo.controller;

import com.codedou.newsdemo.entity.User;
import com.codedou.newsdemo.service.UserService;
import com.codedou.newsdemo.vo.SimpleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public SimpleObject regUser(@RequestParam("userName") String userName,
                                @RequestParam("password") String password,
                                @RequestParam("email") String email){
       return userService.regUser(userName,password,email);
    }

    @PostMapping("/login")
    public SimpleObject login(@RequestParam("userName") String userName,
                      @RequestParam("password") String password){

           return userService.login(userName,password);
    }

    @GetMapping("/user/{userName}")
    public User getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUserName(userName);
    }
}
