package com.flm.dto;

import lombok.Data;

@Data
public class ProductResponseDTO {

	private long productId;

	private String productName;

	private double price;

	private double discount;

	private double rating;

	private boolean isAvailable;

	private int stock;

}
