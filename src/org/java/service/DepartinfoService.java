package org.java.service;

import java.util.List;
import java.util.Map;

import org.java.entity.Departinfo;

public interface DepartinfoService {
	/**删除（根据主键ID查询）**/
    int deleteByPrimaryKey(Integer departid);

    /**添加**/
    int insert(Departinfo record);

    /**添加 （匹配有值的字段）**/
    int insertSelective(Departinfo record);

    /**查询（根据主键ID修改）**/
    Departinfo selectByPrimaryKey(Integer departid);

    /**修改 （匹配有值的字段）**/
    int updateByPrimaryKeySelective(Departinfo record);

    /**修改（根据主键ID修改）**/
    int updateByPrimaryKey(Departinfo record);
    
    /**查询（数据总详情）**/
    List<Departinfo> findAll();
    
    /**查询（数据总详情）**/
    List<Map<String, Object>> findAll2();

}
