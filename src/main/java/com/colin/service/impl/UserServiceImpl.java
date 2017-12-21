package com.colin.service.impl;

import com.colin.dao.UserRespository;
import com.colin.model.User;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Colin on 2017/12/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;

    @Override
    public User addUser(User user) throws RuntimeException {
        User u = userRespository.save(user);
        return u;
    }

    @Override
    public User updateUser(User user) throws RuntimeException {
        User u = userRespository.saveAndFlush(user);
        return u;
    }

    @Override
    public List<User> queryUsers(User user) throws RuntimeException {
        return userRespository.findAll();
    }

    @Override
    public User queryUserById(Long id) throws RuntimeException {
        return userRespository.findOne(id);
    }

    @Override
    public int deleteUser(Long id) throws RuntimeException {
        userRespository.delete(id);
        return 1;
    }
}
