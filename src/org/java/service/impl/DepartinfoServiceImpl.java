package org.java.service.impl;

import java.util.List;
import java.util.Map;

import org.java.dao.DepartinfoMapper;
import org.java.entity.Departinfo;
import org.java.service.DepartinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("departinfoService")
public class DepartinfoServiceImpl implements DepartinfoService {
	
	@Autowired
	private DepartinfoMapper departinfoMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Integer departid) {
		return departinfoMapper.deleteByPrimaryKey(departid);
	}

	@Transactional
	@Override
	public int insert(Departinfo record) {
		return departinfoMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(Departinfo record) {
		return departinfoMapper.insertSelective(record);
	}

	@Transactional(readOnly=true)
	@Override
	public Departinfo selectByPrimaryKey(Integer departid) {
		return departinfoMapper.selectByPrimaryKey(departid);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Departinfo record) {
		return departinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(Departinfo record) {
		return departinfoMapper.updateByPrimaryKey(record);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Departinfo> findAll() {
		return departinfoMapper.findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Map<String, Object>> findAll2() {
		return departinfoMapper.findAll2();
	}

}
