package spring.pj.groubee.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.pj.groubee.admin.vo.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
