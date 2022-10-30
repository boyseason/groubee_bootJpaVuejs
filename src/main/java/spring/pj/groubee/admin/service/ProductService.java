package spring.pj.groubee.admin.service;

import java.util.List;

import spring.pj.groubee.admin.vo.Product;


public interface ProductService {

	public List<Product> listAll();  // list
	public Product save(Product product);// insert
	public Product get(int id);		// 1건 select
	public void delete(int id);		// 1건 delete
}
