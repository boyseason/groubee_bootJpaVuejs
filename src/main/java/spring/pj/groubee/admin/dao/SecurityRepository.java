package spring.pj.groubee.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.pj.groubee.admin.vo.CommonVO;

@Repository
public interface SecurityRepository extends JpaRepository<CommonVO, String>{
	
	@Query(value = "SELECT * FROM grb_member " 
			     + "where authority " 
			     + "IN ('ROLE_ATTEND','ROLE_APPROVAL', 'ROLE_SECURE', 'ROLE_DEPARTMENT', 'ROLE_SERVICE', 'ROLE_HUMAN', 'ROLE_BOARD', 'ROLE_NOTEBOX') ", nativeQuery = true)
	
	public List<CommonVO> adminList();
}
