package com.example.demo1.bean;

import com.example.demo1.controller.RelationController;
import com.example.demo1.dao.IRelationDao;
import com.example.demo1.pojo.Relation;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

public class RelationBean implements Serializable {
    FacesContext context = FacesContext.getCurrentInstance();

    private int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
    private int aimId;

    public HtmlInputTextarea getInputTextarea() {
        return inputTextarea;
    }

    public void setInputTextarea(HtmlInputTextarea inputTextarea) {
        this.inputTextarea = inputTextarea;
    }

    private HtmlInputTextarea inputTextarea;

    public FacesContext getContext() {
        return context;
    }

    public void setContext(FacesContext context) {
        this.context = context;
    }

    public HtmlInputText getInputText() {
        return inputText;
    }

    public void setInputText(HtmlInputText inputText) {
        this.inputText = inputText;
    }

    public RelationController getController() {
        return controller;
    }

    public void setController(RelationController controller) {
        this.controller = controller;
    }

    private HtmlInputText inputText;
    private HtmlInputText inputText2;


    public List<User> getComFriendList() {
        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);
        return relationDao.getComFriendList(hostId, aimId);

    }

    public String getInputText3() {
        return inputText3;
    }

    public void setInputText3(String inputText3) {
        this.inputText3 = inputText3;
    }

    private String inputText3;

    public String doItJust() {

        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);
        List<User> userList = relationDao.getComFriendList(hostId, aimId);
        if (userList.isEmpty()) {
            inputText3 = "no common friends";
        } else {
            inputText3 = userList.toString();
        }


        inputText.setValue(this.aimId);
        inputText2.setValue(this.hostId);


        inputText.setStyle("background-color.green");


        String middle = userList.toString();


        return "myLord";
    }


    RelationController controller =
            new RelationController();

    public void addRelation() {
        //System.out.println(aimId+""+hostId);
        controller.addAction(new Relation(hostId, aimId));

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


    public HtmlInputText getInputText2() {
        return inputText2;
    }

    public void setInputText2(HtmlInputText inputText2) {
        this.inputText2 = inputText2;
    }
}
