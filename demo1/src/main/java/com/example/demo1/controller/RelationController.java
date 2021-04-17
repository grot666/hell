package com.example.demo1.controller;

import com.example.demo1.dao.IRelationDao;
import com.example.demo1.pojo.Relation;
import com.example.demo1.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class RelationController {

    public void addAction(Relation relation) {

        SqlSession session = MybatisUtil.getSqlSession();
        IRelationDao relationDao = session.getMapper(IRelationDao.class);

        if (relationDao.relationExist(relation) == null) {
            //  System.out.println("not exist");
            relationDao.inserRelation(relation);
        }

        session.commit();
        session.close();

    }
}
