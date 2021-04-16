package com.example.demo1.bean;

import javax.faces.component.html.HtmlInputText;

public class UserBean {
    private String name;
    private HtmlInputText inputText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HtmlInputText getInputText() {
        return inputText;
    }

    public void setInputText(HtmlInputText inputText) {
        this.inputText = inputText;
    }

    public String guess(){
        if ("jack".equals(name)){
            inputText.setStyle("background-color:green");
        }else {
            inputText.setValue("hello");
            inputText.setStyle("background-color:red");
        }


        return null;
    }
}
