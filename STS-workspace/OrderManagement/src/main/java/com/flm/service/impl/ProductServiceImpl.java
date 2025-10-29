package com.flm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.flm.dao.ProductRepository;
import com.flm.dto.ProductRequestDTO;
import com.flm.dto.ProductResponseDTO;
import com.flm.model.Product;
import com.flm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductResponseDTO save(ProductRequestDTO productRequestDTO) {
		Product product = new Product();
		product.setProductName(productRequestDTO.getProductName());
		product.setPrice(productRequestDTO.getPrice());
		product.setDiscount(productRequestDTO.getDiscount());
		product.setStock(productRequestDTO.getStock());
		if (product.getStock() > 0) {
			product.setAvailable(true);
		}

		Product savedProduct = productRepository.save(product);

		ProductResponseDTO productResponseDTO = new ProductResponseDTO();
		BeanUtils.copyProperties(savedProduct, productResponseDTO);
		return productResponseDTO;
	}

	@Override
	public List<ProductResponseDTO> saveAllProducts(List<ProductRequestDTO> productRequestDTOs) {

		List<Product> products = buildProductsList(productRequestDTOs);
		List<Product> savedProducts = productRepository.saveAll(products);

		List<ProductResponseDTO> productResponseList = buildProductsResponseList(savedProducts);
		return productResponseList;
	}

	@Override
	public List<ProductResponseDTO> getProducts() {
		List<Product> products = productRepository.findAll();
		List<ProductResponseDTO> productList = buildProductsResponseList(products);

		return productList;
	}

	@Override
	public ProductResponseDTO getProduct(long productId) {
		Product product = productRepository.findById(productId).get();

		ProductResponseDTO productResponseDTO = new ProductResponseDTO();
		BeanUtils.copyProperties(product, productResponseDTO);
		return productResponseDTO;
	}

	@Override
	public List<ProductResponseDTO> getProductByName(String productName) {
		List<Product> products = productRepository.findByProductNameContaining(productName);
		List<ProductResponseDTO> productList = buildProductsResponseList(products);

		return productList;
	}

	@Override
	public ProductResponseDTO updateProductRating(long id, double rating) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			product.setRating(rating);

			Product savedProduct = productRepository.save(product);
			ProductResponseDTO productResponseDTO = new ProductResponseDTO();
			BeanUtils.copyProperties(savedProduct, productResponseDTO);
			return productResponseDTO;
		}

		return new ProductResponseDTO();

	}

	@Override
	public String deleteProduct(long productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			productRepository.delete(product);
			return product.getProductName();
		}
		return null;
	}

	private List<ProductResponseDTO> buildProductsResponseList(List<Product> products) {
		List<ProductResponseDTO> productList = new ArrayList<>();
		for (Product product : products) {
			ProductResponseDTO productResponseDTO = new ProductResponseDTO();
			BeanUtils.copyProperties(product, productResponseDTO);
			productList.add(productResponseDTO);
		}
		return productList;
	}

	private List<Product> buildProductsList(List<ProductRequestDTO> productRequestDTOs) {
		List<Product> products = new ArrayList<>();
		for (ProductRequestDTO productRequestDTO : productRequestDTOs) {
			Product product = new Product();

			BeanUtils.copyProperties(productRequestDTO, product);
			if (product.getStock() > 0) {
				product.setAvailable(true);
			}
			products.add(product);
		}
		return products;
	}

}
