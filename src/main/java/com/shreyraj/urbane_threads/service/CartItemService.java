package com.shreyraj.urbane_threads.service;

import com.shreyraj.urbane_threads.exception.CartItemException;
import com.shreyraj.urbane_threads.exception.UserException;
import com.shreyraj.urbane_threads.model.Cart;
import com.shreyraj.urbane_threads.model.CartItem;
import com.shreyraj.urbane_threads.model.Product;

public interface CartItemService {

	public CartItem createCartItem(CartItem cartItem);

	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

	public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
