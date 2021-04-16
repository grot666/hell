package com.example.demo1.utils.Impl;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import com.example.demo1.utils.RegisterUtil;
import org.apache.ibatis.session.SqlSession;

public class RegisterImpl implements RegisterUtil {
    User user;


    @Override
    public boolean registerUser(User user) {

        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);

        int i = userDao.insertUser(user);

        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();

        if (i == 1){
            return true;
        }else {
            return false;
        }

    }
}
