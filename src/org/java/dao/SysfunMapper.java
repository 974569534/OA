package org.java.dao;

import org.java.entity.Sysfun;

public interface SysfunMapper {
    int deleteByPrimaryKey(Integer nodeid);

    int insert(Sysfun record);

    int insertSelective(Sysfun record);

    Sysfun selectByPrimaryKey(Integer nodeid);

    int updateByPrimaryKeySelective(Sysfun record);

    int updateByPrimaryKey(Sysfun record);
}