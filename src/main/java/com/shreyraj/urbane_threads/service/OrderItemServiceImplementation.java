package com.shreyraj.urbane_threads.service;

import org.springframework.stereotype.Service;

import com.shreyraj.urbane_threads.model.OrderItem;
import com.shreyraj.urbane_threads.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService {

	private OrderItemRepository orderItemRepository;

	public OrderItemServiceImplementation(OrderItemRepository orderItemRepository) {
		this.orderItemRepository = orderItemRepository;
	}

	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {

		return orderItemRepository.save(orderItem);
	}

}