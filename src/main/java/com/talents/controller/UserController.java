package com.talents.controller;

import com.talents.service.UserService;
import com.talents.util.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public ReturnData page(int pager,int pageSize){
        return new ReturnData(userService.page(pager, pageSize));
    }
    
}
