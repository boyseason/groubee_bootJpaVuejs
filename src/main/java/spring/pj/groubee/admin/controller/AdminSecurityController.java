package spring.pj.groubee.admin.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.pj.groubee.admin.service.SecurityService;
import spring.pj.groubee.admin.vo.CommonVO;



@RestController
@RequestMapping(value = "/api")
@CrossOrigin("http://localhost:8020/")
public class AdminSecurityController {

	@Autowired
	private SecurityService securityservice;
	
	//http://localhost:8020/api/securead
	@GetMapping(value="/securead")
	public List<CommonVO> fetchSecurityList() {
		
		return securityservice.adminList();
	}
	
	/*
	 * @RequestMapping(value="/", method= RequestMethod.GET) public Map<String,
	 * Object> viewHome1(Model model){
	 * 
	 * //vuejs -> list.js 의 Product의 payload 값이 model로 전달된다. Map<String, Object> map
	 * = new HashMap<String, Object>();
	 * 
	 * try { List<CommonVO> list = securityservice.adminList(); map.put("list",
	 * list); }catch(Exception e) { e.printStackTrace(); } return map; }
	 */
}
