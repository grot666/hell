package com.example.demo1.dao;

import com.example.demo1.pojo.Relation;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {







    @Test
    public void testGetFriends(){
        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);

        List<Relation> relations;
        //relations = relationDao.getOnceFriends(109);
        relations = relationDao.getCommonFriends(110,113);
        for (Relation relation :relations){
            System.out.println(relation.toString());
        }


    }
    @Test
    public void getId(){
        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        int i = userDao.returnUserId("1");
        System.out.println(i);

    }
    @Test
    public void testInsert(){
        SqlSession session = MybatisUtil.getSqlSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User user = new User("yucheng","123123","yycheng");
        int i = userDao.insertUser(user);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }
    @Test
    public void test(){
        //get sqlSession Object
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //sql query
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();

    }
}
