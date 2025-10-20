package com.flm.service;

import com.flm.dto.ProductRequestDto;
import com.flm.dto.ProductResponseDto;

public interface ProductService {
	public ProductResponseDto save(ProductRequestDto productRequestDto);

}
