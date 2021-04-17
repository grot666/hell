package com.example.demo1.bean;

import com.example.demo1.dao.IRelationDao;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import javax.faces.context.FacesContext;
import java.util.List;

public class BeanTest {
    @Test
    public void test32(){
        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);

        List<User> list = relationDao.getComFriendList(110,113);
                //new RelationBean().getComFriendList();

        System.out.println(list);
    }

    @Test
    public void hostIdTest(){
        FacesContext context = FacesContext.getCurrentInstance();

        int hostId = (int) context.getExternalContext().getSessionMap().get("userid");
        System.out.println(hostId);
    }
}
