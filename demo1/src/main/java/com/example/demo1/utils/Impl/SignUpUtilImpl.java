package com.example.demo1.utils.Impl;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import com.example.demo1.utils.SignUpUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SignUpUtilImpl implements SignUpUtil {
    @Override
    public boolean SignUpResult(String email, String pwd) {
        //get sqlSession Object
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        //sql query
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList){
            if (user.getEmail().equals(email))
                return false;
        }
        sqlSession.close();
        return true;

    }
}
