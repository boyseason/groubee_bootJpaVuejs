package spring.pj.groubee.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pj.groubee.admin.dao.HumanRepository;
import spring.pj.groubee.admin.vo.CommonVO;

@Service
public class HumanServiceImpl implements HumanService{
	
	@Autowired
	private HumanRepository humandao;

	@Override
	public List<CommonVO> humanList() {
		
		return humandao.humanList();
	}
	
	
}
