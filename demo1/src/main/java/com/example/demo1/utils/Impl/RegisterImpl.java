package com.example.demo1.utils.Impl;

import com.example.demo1.bean.User;
import com.example.demo1.utils.RegisterUtil;

public class RegisterImpl implements RegisterUtil {
    User user;


    @Override
    public boolean registerUser(User user) {
        return true;

    }
}
