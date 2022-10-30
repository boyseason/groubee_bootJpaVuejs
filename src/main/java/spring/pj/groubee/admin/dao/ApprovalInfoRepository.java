package spring.pj.groubee.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import spring.pj.groubee.admin.vo.ApprovalInfoVO;

@Repository
public interface ApprovalInfoRepository extends JpaRepository<ApprovalInfoVO, Integer> {
	
	@Query(value = "SELECT * FROM (SELECT A.*, rownum as rn "
			+ "FROM (select d.doc_id, d.title, "
			+ 		" m.name, m.rank, d.state, d.category "
			+ "from grb_draft d "
			+ "join grb_member m on m.id = d.id where d.stateid = 'com' "
			+ "order by d.doc_id desc) A) WHERE rn >= 1 AND rn <= 10", nativeQuery = true)
	public List<Object[]> findBycategory();
}