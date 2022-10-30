package spring.pj.groubee.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pj.groubee.admin.dao.SecurityRepository;
import spring.pj.groubee.admin.vo.CommonVO;


@Service
public class SecurityServiceImpl implements SecurityService{
	
	@Autowired
	private SecurityRepository securitydao;
	//관리자 리스트 뿌리기
	@Override
	public List<CommonVO> adminList() {
		
		return securitydao.adminList();
	}

}
