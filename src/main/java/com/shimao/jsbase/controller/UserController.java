package com.shimao.jsbase.controller;

import com.shimao.jsbase.entity.User;
import com.shimao.jsbase.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getAll")
    public List<User> getUsers() {
        return userService.getAll();
    }


}
