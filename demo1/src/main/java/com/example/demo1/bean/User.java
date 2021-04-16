package com.example.demo1.bean;

public class User {
    private int id;
    private String name;
    private String passWord;
    private String email;

    public User(String name, String passWord, String email) {
        this.name = name;
        this.passWord = passWord;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
