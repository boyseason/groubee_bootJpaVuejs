package spring.pj.groubee.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.pj.groubee.admin.service.ApprovalServiceImpl;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin("http://localhost:8020/")

public class ApprovalController {
	@Autowired
	ApprovalServiceImpl service;
	
	@GetMapping(value="/approvallist")
	public List<Map<String, Object>> approvallist(Model model) {
		List<Map<String, Object>> list = service.listDraftBycategory();
		return list;
	}

}
