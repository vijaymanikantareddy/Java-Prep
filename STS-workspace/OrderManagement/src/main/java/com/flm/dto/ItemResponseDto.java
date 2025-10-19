package com.flm.dto;

import lombok.Data;

@Data
public class ItemResponseDto {

	private long itemId;

	private String itemName;

	private double price;

	private double discount;

	private double rating;

	private boolean isAvailable;

	private int stock;

}
