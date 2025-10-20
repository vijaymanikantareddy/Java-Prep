package com.flm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;
import com.flm.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/save")
	public ProductResponseDto saveProduct(@RequestBody ProductRequestDto productRequestDto) {
		return productService.save(productRequestDto);
	}
}
