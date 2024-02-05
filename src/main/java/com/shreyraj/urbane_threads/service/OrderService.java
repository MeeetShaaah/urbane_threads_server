package com.shreyraj.urbane_threads.service;

import java.util.List;

import com.shreyraj.urbane_threads.exception.OrderException;
import com.shreyraj.urbane_threads.model.Address;
import com.shreyraj.urbane_threads.model.Order;
import com.shreyraj.urbane_threads.model.User;

public interface OrderService {

	public Order createOrder(User user, Address shippingAdress);

	public Order findOrderById(Long orderId) throws OrderException;

	public List<Order> usersOrderHistory(Long userId);

	public Order placedOrder(Long orderId) throws OrderException;

	public Order confirmedOrder(Long orderId) throws OrderException;

	public Order shippedOrder(Long orderId) throws OrderException;

	public Order deliveredOrder(Long orderId) throws OrderException;

	public Order cancledOrder(Long orderId) throws OrderException;

	public List<Order> getAllOrders();

	public void deleteOrder(Long orderId) throws OrderException;

}
