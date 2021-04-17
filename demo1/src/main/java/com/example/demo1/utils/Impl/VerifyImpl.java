package com.example.demo1.utils.Impl;

import com.example.demo1.pojo.User;
import com.example.demo1.utils.Csrf;
import com.example.demo1.utils.IVerifyUtil;


import javax.faces.context.FacesContext;

public class VerifyImpl implements IVerifyUtil {
    String token = new Csrf().generate(32);


    @Override
    public boolean verifyAccount(User user) {

        FacesContext context = FacesContext.getCurrentInstance();
        if (context.getExternalContext().getSessionMap().get("userid") == null) {
            context.getExternalContext().getSessionMap().put("userid", user.getId());
        } else {

            //context.getExternalContext().getSessionMap().put("id", 9);
            context.getExternalContext().getSessionMap().put("token", token);
            return !context.getExternalContext().getSessionMap().get("userid").equals(user.getId());
        }
        return true;
    }

    public void logout() {


        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
}
