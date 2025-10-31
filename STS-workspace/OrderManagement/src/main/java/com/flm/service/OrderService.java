package com.flm.service;

import java.util.List;

import com.flm.dto.OrderRequestDTO;
import com.flm.dto.OrderResponseDTO;

public interface OrderService {
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTOs);

	public OrderResponseDTO getOrderInfo(long orderId);
}
