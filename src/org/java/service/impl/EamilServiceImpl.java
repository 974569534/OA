package org.java.service.impl;

import org.java.dao.EamilMapper;
import org.java.entity.Eamil;
import org.java.service.EamilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("eamilService")
public class EamilServiceImpl implements EamilService {
	
	@Autowired
	private EamilMapper eamilService;
	
	@Override
	public int insert(Eamil eamil) {
		
		return eamilService.insert(eamil);
	}

}
