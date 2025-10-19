package com.flm.dto;

import lombok.Data;

@Data

public class ItemRequestDto {

	private String itemName;

	private double price;

	private double discount;

	private int stock;

}
