package com.example.demo1.dao;

import com.example.demo1.pojo.Posts;

import java.util.List;

public interface IPostsDao {
    int insertPostToBaseDeDonneesParMybatisFrameWorkToDayNiceImGladLoL(int aid,String content);
    List<Posts> selectFriendsPost(int aid);
}
