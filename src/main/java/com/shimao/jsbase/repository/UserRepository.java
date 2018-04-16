package com.shimao.jsbase.repository;

import com.shimao.jsbase.entity.User;

import java.util.List;

public interface UserRepository {

    List<User>getAll();

    int insert(User user);

    int update(User user);

    int delete(int id);

}
