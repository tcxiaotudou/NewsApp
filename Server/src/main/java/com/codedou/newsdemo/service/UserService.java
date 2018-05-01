package com.codedou.newsdemo.service;

import com.codedou.newsdemo.entity.User;
import com.codedou.newsdemo.repository.UserRepository;
import com.codedou.newsdemo.utils.MD5Tools;
import com.codedou.newsdemo.vo.SimpleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUerById(Integer id){
        return userRepository.findOne(id);
    }

    public SimpleObject regUser(String userName, String password, String email) {
        User users = userRepository.findByUserName(userName);
        if(users!=null){
            SimpleObject simpleObject = new SimpleObject(400,"该用户名已存在");
            return simpleObject;
        }
        long timestamp = System.currentTimeMillis();
        String pass = MD5Tools.MD5(password);
        User user = new User(userName,pass,email,timestamp);
        userRepository.save(user);
        return new SimpleObject(200,"注册成功");
    }

    public SimpleObject login(String username,String password){
        User user = userRepository.findByUserName(username);
        if(MD5Tools.MD5(password).equals(user.getPassWord())){
            return new SimpleObject(200,"登录成功");
        }
        else {
            return new SimpleObject(400,"账号或密码错误");
        }
    }

    public User getUserByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
