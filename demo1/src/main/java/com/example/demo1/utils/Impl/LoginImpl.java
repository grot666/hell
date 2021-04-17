package com.example.demo1.utils.Impl;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ILoginUtil;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class LoginImpl implements ILoginUtil {

    @Override
    public boolean loginCheck(String email, String password) {
        //get sqlSession Object
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //sql query
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList){
            if (user.getEmail().equals(email) && user.getPassword().equals(password))
                return true;
            //email should be unique
        }
        sqlSession.close();

        return false;
    }
}
