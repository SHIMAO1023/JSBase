package com.shimao.jsbase.controller;

import com.shimao.jsbase.entity.User;
import com.shimao.jsbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping()
    public String create() {
        String result = "failed";

        return result;
    }


    @RequestMapping(value = "api/user", method = RequestMethod.GET)
    public List<User> users() {
        return userService.getAll();
    }


}

