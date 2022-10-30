package spring.pj.groubee.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.pj.groubee.admin.service.HumanService;
import spring.pj.groubee.admin.vo.CommonVO;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin("http://localhost:8020/")
public class HumanController {
	
	@Autowired
	private HumanService humanservice;
	
	
	//http://localhost:8020/api/humanad
	@GetMapping(value="/humanad")
	public List<CommonVO> fetchHumanList() {
		
		return humanservice.humanList();
	}
}
