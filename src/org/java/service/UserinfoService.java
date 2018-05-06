package org.java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.java.entity.Paging;
import org.java.entity.Userinfo;

public interface UserinfoService {

	/**删除（根据主键ID查询）**/
    int deleteByPrimaryKey(String userid);
    
    /**添加**/
    int insert(Userinfo record);
    
    /**添加 （匹配有值的字段）**/
    int insertSelective(Userinfo record);
    
    /**查询（根据主键ID修改）**/
    Userinfo selectByPrimaryKey(String userid);
    
    /**修改 （匹配有值的字段）**/
    int updateByPrimaryKeySelective(Userinfo record);
    
    /**修改（根据主键ID修改）**/
    int updateByPrimaryKey(Userinfo record);
    
    /**查询（数据总条数）**/
    int getCount();
    
    /**查询（数据总详情，带分页）**/
    List<Userinfo> findAll(@Param("p") Paging p);
}
