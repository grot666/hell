package com.example.demo1.dao;

import com.example.demo1.pojo.Posts;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PostTest {
    SqlSession session = MybatisUtil.getSqlSession();
    IPostsDao iPostsDao = session.getMapper(IPostsDao.class);
    @Test
    public void test234()
    {


        List<Posts> postsList = iPostsDao.selectFriendsPost(109);

        System.out.println(postsList.toString());
    }
    @Test
    public void testInsertPost(){

    }
}
