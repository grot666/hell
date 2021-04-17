package com.example.demo1.bean;

import org.junit.jupiter.api.Test;

import javax.faces.context.FacesContext;

public class BeanTest {
    @Test
    public void hostIdTest(){
        FacesContext context = FacesContext.getCurrentInstance();

        int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
        System.out.println(hostId);
    }
}
