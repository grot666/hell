package com.example.demo1.utils.Impl;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.utils.IUserIdGetterUtil;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserIdGetterImpl implements IUserIdGetterUtil {
    @Override
    public int setUserId(String email) {
        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        int i = userDao.returnUserId(email);
        System.out.println(i);
        return i;
    }
}
