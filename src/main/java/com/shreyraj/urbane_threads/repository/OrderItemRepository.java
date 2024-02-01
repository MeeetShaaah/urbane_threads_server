package com.shreyraj.urbane_threads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyraj.urbane_threads.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
