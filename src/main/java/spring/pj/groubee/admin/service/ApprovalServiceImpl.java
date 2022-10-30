package spring.pj.groubee.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pj.groubee.admin.dao.ApprovalInfoRepository;

@Service
public class ApprovalServiceImpl implements ApprovalService{

	@Autowired
	ApprovalInfoRepository dao;
	
	@Override
	public List<Map<String, Object>> listDraftBycategory() {
		List<Object[]> list = dao.findBycategory();
		List<Map<String, Object>> listMap = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Object[] arryTemp = list.get(i);
			map.put("doc_id", arryTemp[0]);
			map.put("title", arryTemp[1]);
			map.put("id ", arryTemp[2]);
			map.put("upday", arryTemp[3]);
			map.put("name", arryTemp[4]);
			map.put("rank", arryTemp[5]);
			map.put("state", arryTemp[6]);
			map.put("category", arryTemp[7]);
			listMap.add(map);
		}
		return listMap;
	}
	

}
