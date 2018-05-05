package org.java.service;

import java.util.List;
import java.util.Map;

import org.java.entity.Paging;

public interface UserInfoService {
	/**查询数据总条数**/
	public Integer getCount();
	/**查询数据总信息，分页显示**/
	public List<Map<String, Object>> findAll(Paging p);
}
