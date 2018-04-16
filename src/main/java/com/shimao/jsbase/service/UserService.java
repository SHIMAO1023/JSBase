package com.shimao.jsbase.service;

import com.shimao.jsbase.entity.User;

import java.util.List;

public interface UserService {

    List<User>getAll();

    boolean insert(User user);

    boolean update(User user);

    boolean delete(int id);
}
