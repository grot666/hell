package com.example.demo1.dao;

import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //get sqlSession Object
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //sql query
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();

    }
}
