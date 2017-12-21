package com.colin.controller;

import com.colin.dao.DeparmentResponsitory;
import com.colin.dao.RoleReponsitory;
import com.colin.dao.UserRespository;
import com.colin.model.Deparment;
import com.colin.model.Role;
import com.colin.model.User;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Colin on 2017/12/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleReponsitory roleReponsitory;

    @Autowired
    private DeparmentResponsitory deparmentResponsitory;


    @RequestMapping(value="saveUser",method = RequestMethod.GET)
    @ResponseBody
    public User saveUser(){
        Deparment deparment = new Deparment();
        deparment.setName("研发部");
        deparmentResponsitory.save(deparment);
        Assert.notNull(deparment.getId());
        Role role = new Role();
        role.setName("项目经理");
        roleReponsitory.save(role);
        Assert.notNull(role.getId());
        List<Role> roles = roleReponsitory.findAll();
        User user = new User();
        user.setCreateDate(new Date());
        user.setName("张三");
        user.setDeparment(deparment);
        user.setRoles(roles);
        return userService.addUser(user);
    }

    @RequestMapping(value = "/findUserById",method = RequestMethod.GET)
    @ResponseBody
    public User findUserByUserId(Long id){
        return userService.queryUserById(id);
    }
}
