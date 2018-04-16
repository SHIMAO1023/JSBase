package com.shimao.jsbase.service;

import com.shimao.jsbase.dao.UserDao;
import com.shimao.jsbase.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    //@Autowired ???
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return  userDao.getAll();
    }

    @Override
    public boolean insert(User user) {
        return  userDao.insert(user)>0;
    }

    @Override
    public boolean update(User user) {
        return  userDao.update(user)>0;
    }

    @Override
    public boolean delete(int id) {
        return userDao.delete(id)>0;
    }
}
