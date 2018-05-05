package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.java.entity.Paging;


public interface UserInfoMapper {

	/**查询数据总条数**/
	@Select("select count(*) from userinfo ")
	public Integer getCount();
	
	/**查询数据总信息，分页显示**/
	@Select("select * from userinfo limit (#{pageIndex}-1)*#{pageSize},#{pageSize} ")
	public List<Map<String, Object>> findAll(@Param("p") Paging p);
	
}
