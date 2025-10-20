package com.flm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
