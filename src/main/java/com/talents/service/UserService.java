package com.talents.service;

import com.talents.dao.User;
import com.talents.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.selectById(id);
    }

    public List<User> page(int pager, int pageSize) {
        int start = (pager - 1) * pageSize;
        List<User> list = userMapper.page(start,pageSize);
        return list;
    }
}
