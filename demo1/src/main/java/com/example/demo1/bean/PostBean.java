package com.example.demo1.bean;

import com.example.demo1.dao.IPostsDao;
import com.example.demo1.dao.IRelationDao;
import com.example.demo1.pojo.Posts;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

public class PostBean implements Serializable {
    String content;
    FacesContext context = FacesContext.getCurrentInstance();
    int aid = (int) context.getExternalContext().getSessionMap().get("userid");

    public FacesContext getContext() {
        return context;
    }

    public void setContext(FacesContext context) {
        this.context = context;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public List<Posts> getPostsList() {
        return selectPostsFromMyFriends(this.aid);
    }

    public List<Posts> selectPostsFromMyFriends(int aid) {
        SqlSession session = MybatisUtil.getSqlSession();
        IPostsDao postsDao = session.getMapper(IPostsDao.class);
        return postsDao.selectFriendsPost(this.aid);


    }

    public void setPostsList() {
        List<Posts> postsList = selectPostsFromMyFriends(this.aid);
        if (postsList == null) {
            postsList.add(new Posts(1, "1"));
        }
        this.postsList = postsList;
    }

    private List<Posts> postsList = null;


    public int getId() {
        return aid;
    }

    public void setId(int aid) {
        this.aid = aid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String insertPost() {

        SqlSession session = MybatisUtil.getSqlSession();
        IPostsDao postsDao = session.getMapper(IPostsDao.class);
        if (
                postsDao.insertPostToBaseDeDonneesParMybatisFrameWorkToDayNiceImGladLoL(this.aid, this.content)
                        != 0) {
            session.commit();
            session.close();
            return "succeed";
        } else {
            return "failed";
        }


    }
}
