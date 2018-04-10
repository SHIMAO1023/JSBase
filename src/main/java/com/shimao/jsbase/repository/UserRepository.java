package com.shimao.jsbase.repository;

import com.shimao.jsbase.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    private final SqlSession sqlSession;

    public UserRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User getUserById(int id) {
        return this.sqlSession.selectOne("selectUserById", id);
    }
}
