package com.talents.dao.controller;

import com.talents.dao.service.UserService;
import com.talents.util.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/getOne")
    @ResponseBody
    public ReturnData getOne(int id){
        return new ReturnData(userService.getUserById(id));
    }
    
}
