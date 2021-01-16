package com.talents.dao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
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

}
