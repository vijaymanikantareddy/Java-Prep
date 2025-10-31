package com.flm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.dao.OrderRepository;
import com.flm.dao.ProductRepository;
import com.flm.dto.OrderItemResponseDTO;
import com.flm.dto.OrderRequestDTO;
import com.flm.dto.OrderResponseDTO;
import com.flm.exception.OrderNotFoundException;
import com.flm.model.Order;
import com.flm.model.OrderItem;
import com.flm.model.Product;
import com.flm.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	OrderRepository orderRepository;

	@Override
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTOList) {
		Order order = new Order();

		List<OrderItem> orderItemsList = new ArrayList<>();
		order.setStatus("Ordered");

		for (OrderRequestDTO orderRequestDTO : orderRequestDTOList) {
			OrderItem orderItem = new OrderItem();

			Product product = productRepository.findById(orderRequestDTO.getProductId()).get();
			if (product.getStock() >= orderRequestDTO.getQuantity()) {
				orderItem.setQuantity(orderRequestDTO.getQuantity());
				orderItem.setProduct(product);
				orderItem.setOrder(order);

				orderItemsList.add(orderItem);

				productRepository.updateStock(product.getProductId(),
						product.getStock() - orderRequestDTO.getQuantity());
			}

		}
		order.setOrderItems(orderItemsList);

		Order savedOrder = orderRepository.save(order);

		return buildOrderResponseDtoFromOrder(savedOrder);
	}

	private OrderResponseDTO buildOrderResponseDtoFromOrder(Order savedOrder) {
		OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
		orderResponseDTO.setOrderId(savedOrder.getOrderId());
		orderResponseDTO.setStatus(savedOrder.getStatus());

		List<OrderItemResponseDTO> orderItemResponseDTOList = new ArrayList<>();
		double totalOrderAmount = 0;

		for (OrderItem orderItem : savedOrder.getOrderItems()) {
			OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();
			orderItemResponseDTO.setProductId(orderItem.getProduct().getProductId());
			orderItemResponseDTO.setProductName(orderItem.getProduct().getProductName());
			orderItemResponseDTO.setQuantity(orderItem.getQuantity());

			double price = orderItem.getProduct().getPrice();

			double discount = orderItem.getProduct().getDiscount();

			double discountedPrice = price * (1 - discount / 100);

			orderItemResponseDTO.setEachProductPrice(discountedPrice);

			double totalProductPrice = discountedPrice * orderItem.getQuantity();

			orderItemResponseDTO.setTotalProductPrice(totalProductPrice);
			totalOrderAmount += totalProductPrice;

			orderItemResponseDTOList.add(orderItemResponseDTO);
		}

		orderResponseDTO.setTotalAmount(totalOrderAmount);
		orderResponseDTO.setOrderItems(orderItemResponseDTOList);
		return orderResponseDTO;
	}

	@Override
	public OrderResponseDTO getOrderInfo(long orderId) {
		Order order = orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("No Order Found With Id : " + orderId));
		return buildOrderResponseDtoFromOrder(order);
	}

}
