package spring.pj.groubee.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pj.groubee.admin.dao.ProductRepository;
import spring.pj.groubee.admin.vo.Product;




@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository dao;

	// List
	@Override
	public List<Product> listAll() {
		return dao.findAll();
	}

	// insert
	@Override
	public Product save(Product product) {
		Product vo = dao.save(product);
		return vo;
	}

	// 1건 select
	@Override
	public Product get(int id) {
		return dao.findById(id).get();
	}

	// 1건 delete
	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
