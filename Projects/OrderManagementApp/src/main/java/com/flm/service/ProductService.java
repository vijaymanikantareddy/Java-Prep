package com.flm.service;

import java.util.List;

import com.flm.dto.ProductRequestDTO;
import com.flm.dto.ProductResponseDTO;

public interface ProductService {
	public ProductResponseDTO save(ProductRequestDTO productRequestDTO);

	public List<ProductResponseDTO> getProducts();

	public ProductResponseDTO getProduct(long productId);

	public List<ProductResponseDTO> getProductByName(String productName);

	public List<ProductResponseDTO> saveAllProducts(List<ProductRequestDTO> productRequestDTOs);

	public ProductResponseDTO updateProductRating(long id, double rating);

	public String deleteProduct(long productId);
}
