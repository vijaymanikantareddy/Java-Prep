package com.flm.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.flm.dao.ProductRepository;
import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;
import com.flm.model.Product;
import com.flm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductResponseDto save(ProductRequestDto productRequestDto) {
		Product product = new Product();
		product.setProductName(productRequestDto.getProductName());
		product.setPrice(productRequestDto.getPrice());
		product.setDiscount(productRequestDto.getDiscount());
		product.setAvailable(true);
		product.setStock(productRequestDto.getStock());

		Product savedProduct = productRepository.save(product);

		ProductResponseDto productResponseDto = new ProductResponseDto();
		BeanUtils.copyProperties(savedProduct, productResponseDto);
		return productResponseDto;
	}

}
