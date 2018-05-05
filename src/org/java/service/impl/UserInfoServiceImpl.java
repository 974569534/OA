package org.java.service.impl;

import java.util.List;
import java.util.Map;

import org.java.dao.UserInfoMapper;
import org.java.entity.Paging;
import org.java.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public Integer getCount() {
		return userInfoMapper.getCount();
	}

	@Override//https://github.com/974569534/OA.git
	public List<Map<String, Object>> findAll(Paging p) {
		return userInfoMapper.findAll(p);
	}

}
