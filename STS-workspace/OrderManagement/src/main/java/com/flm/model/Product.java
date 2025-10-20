package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long productId;

	@Column(nullable = false)
	private String productName;

	@Column(nullable = false)
	private double price;

	private double discount;

	private double rating;

	private boolean isAvailable;

	@Column(nullable = false)
	private int stock;

	public Product(String productName, double price, double discount, double rating, boolean isAvailable, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.isAvailable = isAvailable;
		this.stock = stock;
	}

}
