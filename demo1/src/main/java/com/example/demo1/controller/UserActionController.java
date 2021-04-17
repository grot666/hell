package com.example.demo1.controller;

import com.example.demo1.dao.IUserDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.Impl.LoginImpl;
import com.example.demo1.utils.Impl.RegisterImpl;
import com.example.demo1.utils.Impl.SignUpUtilImpl;
import com.example.demo1.utils.Impl.VerifyImpl;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserActionController {

    public static List<User> getAllUserAction() {
        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);

        return userDao.getUserList();

    }


    public String logoutAction() {
        new VerifyImpl().logout();
        return "index";
    }


    public String loginAction(User user) {
        if (new LoginImpl().loginCheck(user.getEmail(), user.getPassword())) {

            if (new VerifyImpl().verifyAccount(user)) {
                return "success";
            }

        }
        return "failed";
    }

    public String signUpAction(User user) {

        if (new SignUpUtilImpl().SignUpResult(user.getEmail(), user.getPassword())) {

            if (new RegisterImpl().registerUser(user)) {
                return "success";
            } else {
                return "error_register";
            }
        } else {
            return "failed";
        }
    }

}
