package com.colin.controller;

import com.colin.model.User;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Colin on 2017/12/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="user",method = RequestMethod.PUT)
    @ResponseBody
    public User saveUser(User user){
        return userService.addUser(user);
    }
}
