package com.example.demo1.bean;

import com.example.demo1.controller.UserActionController;
import com.example.demo1.pojo.User;

import com.example.demo1.utils.Impl.VerifyImpl;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String name;
    private String password;
    private String email;
    private UserActionController controller =
            new UserActionController();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(){

        return controller.loginAction(new User(name,password,email));

    }

    public String signUp(){

        return controller.signUpAction(new User(name,password,email));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String logout(){
       return controller.logoutAction();
    }
}
