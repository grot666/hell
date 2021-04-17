package com.example.demo1.utils.Impl;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import com.example.demo1.utils.IRegisterUtil;
import org.apache.ibatis.session.SqlSession;

public class RegisterImpl implements IRegisterUtil {
    User user;


    @Override
    public boolean registerUser(User user) {

        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);

        int i = userDao.insertUser(user);

        session.commit(); //gg
        session.close();

        if (i == 1){
            return true;

        }else {
            return false;
            //help users recognize ,diagnose,and recover!
        }

    }
}
