package com.example.demo1.bean;

import com.example.demo1.utils.Impl.RegisterImpl;
import com.example.demo1.utils.Impl.SignUpUtilImpl;
import com.example.demo1.utils.RegisterUtil;

import javax.faces.component.html.HtmlInputText;

public class UserBean {
    private String name;
    private String password;
    private String email;

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
        if ("jack".equals(name)){

            return "success";
        }else {

            return "failed";
        }

    }
    public String signUp(){
        if (new SignUpUtilImpl().SignUpResult(email,name)){

            if (new RegisterImpl().registerUser(new User(name,password,email))){
                return "success";
            }
            else {
                return "error_register";
            }
        }
        else {
            return "failed";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
