package org.java.service.impl;

import java.util.List;

import org.java.dao.UserinfoMapper;
import org.java.entity.Paging;
import org.java.entity.Userinfo;
import org.java.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userinfoServiceImpl")
public class UserinfoServiceImpl implements UserinfoService {
	
	@Autowired
	private UserinfoMapper userinfoMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(String userid) {
		return userinfoMapper.deleteByPrimaryKey(userid);
	}

	@Transactional
	@Override
	public int insert(Userinfo record) {
		return userinfoMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(Userinfo record) {
		return userinfoMapper.insertSelective(record);
	}

	@Transactional(readOnly=true)
	@Override
	public Userinfo selectByPrimaryKey(String userid) {
		return userinfoMapper.selectByPrimaryKey(userid);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Userinfo record) {
		return userinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(Userinfo record) {
		return userinfoMapper.updateByPrimaryKey(record);
	}

	@Transactional
	@Override
	public int getCount() {
		return userinfoMapper.getCount();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Userinfo> findAll(Paging p) {
		return userinfoMapper.findAll(p);
	}

}
