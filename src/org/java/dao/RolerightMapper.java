package org.java.dao;

import org.java.entity.Roleright;

public interface RolerightMapper {
    int deleteByPrimaryKey(Integer rolerightid);

    int insert(Roleright record);

    int insertSelective(Roleright record);

    Roleright selectByPrimaryKey(Integer rolerightid);

    int updateByPrimaryKeySelective(Roleright record);

    int updateByPrimaryKey(Roleright record);
}