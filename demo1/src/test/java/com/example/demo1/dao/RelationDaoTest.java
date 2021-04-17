package com.example.demo1.dao;

import com.example.demo1.pojo.Relation;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RelationDaoTest {
    SqlSession session = MybatisUtil.getSqlSession();
    IRelationDao relationDao = session.getMapper(IRelationDao.class);

    @Test
    public void Test2(){
        relationDao.inserRelation(new Relation(101,111));
        session.commit();
        session.close();
    }
    @Test
    public  void  Test1(){


        System.out.println(relationDao.relationExist(new Relation(109,110)
        ).toString());
        Relation relation = relationDao.relationExist(new Relation(999,999));
        if (relation == null){
            System.out.println("not exist");
        }
        session.close();


    }
}
