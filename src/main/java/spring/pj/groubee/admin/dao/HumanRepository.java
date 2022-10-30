package spring.pj.groubee.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.pj.groubee.admin.vo.CommonVO;

@Repository
public interface HumanRepository extends JpaRepository<CommonVO, String>{

	@Query(value = "SELECT * FROM grb_member " 
		         + "where show=1 " 
		         + "ORDER BY id ", nativeQuery = true)

	public List<CommonVO> humanList();
}
