package com.shimao.jsbase.dao;

import com.shimao.jsbase.entity.User;

import java.util.List;

public interface UserDao {

    List<User>getAll();

    int insert(User user);

    int update(User user);

    int delete(int id);

}
