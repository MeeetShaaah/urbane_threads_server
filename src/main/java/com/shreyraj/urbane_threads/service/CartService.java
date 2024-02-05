package com.shreyraj.urbane_threads.service;

import com.shreyraj.urbane_threads.exception.ProductException;
import com.shreyraj.urbane_threads.model.Cart;
import com.shreyraj.urbane_threads.model.CartItem;
import com.shreyraj.urbane_threads.model.User;
import com.shreyraj.urbane_threads.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);

	public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException;

	public Cart findUserCart(Long userId);

}
