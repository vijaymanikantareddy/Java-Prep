package com.flm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.ProductRequestDTO;
import com.flm.dto.ProductResponseDTO;
import com.flm.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/save")
	public ProductResponseDTO saveProduct(@RequestBody ProductRequestDTO productRequestDTO) {
		return productService.save(productRequestDTO);
	}

	@PostMapping("/save/all")
	public List<ProductResponseDTO> saveAllProducts(@RequestBody List<ProductRequestDTO> productRequestDTOs) {
		return productService.saveAllProducts(productRequestDTOs);
	}

	@GetMapping
	public List<ProductResponseDTO> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/{id}")
	public ProductResponseDTO getProduct(@PathVariable(name = "id") long productId) {
		return productService.getProduct(productId);
	}

	@GetMapping("/name")
	public List<ProductResponseDTO> getProductByName(@RequestParam(name = "productName") String productName) {
		return productService.getProductByName(productName);
	}

	@PutMapping("/update/{id}")
	public ProductResponseDTO updateProductRating(@PathVariable(name = "id") long id,
			@RequestParam(name = "rating") double rating) {
		return productService.updateProductRating(id, rating);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") long productId) {
		return productService.deleteProduct(productId);
	}

}
