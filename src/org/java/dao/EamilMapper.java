package org.java.dao;

import org.java.entity.Eamil;

public interface EamilMapper {
    int deleteByPrimaryKey(Integer eamilid);

    int insert(Eamil record);

    int insertSelective(Eamil record);

    Eamil selectByPrimaryKey(Integer eamilid);

    int updateByPrimaryKeySelective(Eamil record);

    int updateByPrimaryKey(Eamil record);
}