package com.example.demo1.dao;

import com.example.demo1.pojo.Relation;
import com.example.demo1.pojo.User;


import java.util.List;

public interface IRelationDao {
    List<Relation> getOnceFriends( int hostID);
    List<Relation> getCommonFriends(int hostId ,int aimID);
    Relation relationExist(Relation relation);
    List<User> getOnceFriendList(int hostID);
    List<User> getComFriendList(int hostID,int aimId );
    void inserRelation(Relation relation);
}
