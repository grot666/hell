package com.example.demo1.bean;

import com.example.demo1.controller.RelationController;
import com.example.demo1.dao.IRelationDao;
import com.example.demo1.pojo.Relation;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

public class RelationBean implements Serializable {
    FacesContext context = FacesContext.getCurrentInstance();

    private int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
    private int aimId;
    private List<User> onceFriendList = null;
    RelationController controller =
            new RelationController();

    public void addRelation(){
    //System.out.println(aimId+""+hostId);
        controller.addAction(new Relation(hostId,aimId));

    }

    public List<User> getOnceFriendList() {
        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);
        return relationDao.getOnceFriendList(this.hostId);
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
