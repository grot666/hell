package com.example.demo1.dao;

import com.example.demo1.pojo.Relation;


import java.util.List;

public interface IRelationDao {
    List<Relation> getOnceFriends( int hostID);
    List<Relation> getCommonFriends(int hostId ,int aimID);
    Relation relationExist(Relation relation);

    void inserRelation(Relation relation);
}
