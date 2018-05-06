package org.java.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.java.entity.Departinfo;
import org.java.service.DepartinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartinfoController {
	
	@Autowired
	private DepartinfoService departinfoService;
	
	/**添加一条部门信息**/
	@RequestMapping("/addByDepartinfo")
	public String addByDepartinfo(Departinfo record){
		departinfoService.insert(record);
		return "info-depart";
	}
	
	/**查询全部部门信息**/
	@RequestMapping("/findAllByDepartinfo1")
	@ResponseBody
	public List<Departinfo> findAllByDepartinfo1(){
		List<Departinfo> list = departinfoService.findAll();
		for (Departinfo d : list) {
			System.out.println(d);
		}
		return list;
	}
	
	/**查询全部部门信息**/
	@RequestMapping("/findAllByDepartinfo")
	@ResponseBody
	public List<Map<String, Object>> findAllByDepartinfo(){
		List<Map<String, Object>> list = departinfoService.findAll2();
		for (Map<String, Object> m : list) {
			System.out.println(m);
		}
		return departinfoService.findAll2();
	}
	
	/**删除一条部门信息**/
	@RequestMapping("/delByDepartinfo")
	@ResponseBody
	public int delByDepartinfo(Integer departid){
		System.out.println("删除一条部门信息:"+departid);
		return departinfoService.deleteByPrimaryKey(departid);
	}
	
	/**修改一条部门信息**/
	@RequestMapping("/updateByDepartinfo")
	@ResponseBody
	public int updateByDepartinfo(Departinfo record){
		return departinfoService.updateByPrimaryKeySelective(record);
	}
	
}
