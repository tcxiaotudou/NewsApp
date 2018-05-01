package com.codedou.newsdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IndexController {

    @RequestMapping("/hello")
    public String index(){
        return "哈哈哈";
    }
}
