package com.ding.service.impl;

import com.ding.dao.UserDao;
import com.ding.pojo.User;
import com.ding.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userServiceImpl")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUsers();
    }


}
