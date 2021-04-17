package com.example.demo1.bean;

import javax.faces.context.FacesContext;
import java.io.Serializable;

public class RelationBean implements Serializable {
    FacesContext context = FacesContext.getCurrentInstance();

    private int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
    private int aimId;
    public void addRelation(){
    System.out.println(aimId+""+hostId);

    }




    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public int getAimId() {
        return aimId;
    }

    public void setAimId(int aimId) {
        this.aimId = aimId;
    }
}
