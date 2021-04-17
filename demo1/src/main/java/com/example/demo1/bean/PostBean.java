package com.example.demo1.bean;

import javax.faces.context.FacesContext;
import java.io.Serializable;

public class PostBean implements Serializable {
    String content;
    FacesContext context = FacesContext.getCurrentInstance();
    int id = (int) context.getExternalContext().getSessionMap().get("userid");;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
