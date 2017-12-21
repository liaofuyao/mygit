package com.colin.service;

import com.colin.model.User;

import java.util.List;

/**
 * Created by Colin on 2017/12/21.
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     * @throws RuntimeException
     */
    public User addUser(User user) throws RuntimeException;

    /**
     * 修改用户
     * @param user
     * @return
     * @throws RuntimeException
     */
    public User updateUser(User user) throws RuntimeException;

    /**
     * 查询用户
     * @param user
     * @return
     * @throws RuntimeException
     */
    public List<User> queryUsers(User user) throws RuntimeException;

    /**
     * 删除用户
     * @param id
     * @return
     * @throws RuntimeException
     */
    public int deleteUser(Long id) throws RuntimeException;
}
