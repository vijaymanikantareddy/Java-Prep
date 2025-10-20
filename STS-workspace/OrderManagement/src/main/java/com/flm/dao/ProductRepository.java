package com.flm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductNameContaining(String productName);
}
