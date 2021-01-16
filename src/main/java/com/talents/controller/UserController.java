package com.talents.controller;

import com.talents.dao.User;
import com.talents.service.UserService;
import com.talents.util.ReturnData;
import com.talents.util.ReturnListData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/selectOne")
    @ResponseBody
    public ReturnData selectOne(int id){
        return new ReturnData(userService.getUserById(id));
    }

    @RequestMapping(value = "/user/page")
    @ResponseBody
    public ReturnListData page(int pager,int pageSize){
        List<User> list = userService.page(pager, pageSize);
        int count = userService.count();
        return new ReturnListData(list,count);
    }
    
}
