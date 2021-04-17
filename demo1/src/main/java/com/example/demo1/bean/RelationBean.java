package com.example.demo1.bean;

import com.example.demo1.controller.RelationController;
import com.example.demo1.pojo.Relation;

import javax.faces.context.FacesContext;
import java.io.Serializable;

public class RelationBean implements Serializable {
    FacesContext context = FacesContext.getCurrentInstance();

    private int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
    private int aimId;
    RelationController controller =
            new RelationController();

    public void addRelation(){
    //System.out.println(aimId+""+hostId);
        controller.addAction(new Relation(hostId,aimId));

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
