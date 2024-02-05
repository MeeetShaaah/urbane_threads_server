package com.shreyraj.urbane_threads.service;

import java.util.List;

import com.shreyraj.urbane_threads.exception.ProductException;
import com.shreyraj.urbane_threads.model.Rating;
import com.shreyraj.urbane_threads.model.User;
import com.shreyraj.urbane_threads.request.RatingRequest;

public interface RatingServices {

	public Rating createRating(RatingRequest req, User user) throws ProductException;

	public List<Rating> getProductsRating(Long productId);

}
