package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.dto.OrderRequestDTO;
import com.flm.dto.OrderResponseDTO;
import com.flm.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/buy")
	public OrderResponseDTO placeOrder(@RequestBody List<OrderRequestDTO> orderRequestDTOs) {
		return orderService.placeOrder(orderRequestDTOs);
	}
}
