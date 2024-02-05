package com.shreyraj.urbane_threads.service;

import java.util.List;

import com.shreyraj.urbane_threads.exception.ProductException;
import com.shreyraj.urbane_threads.model.Review;
import com.shreyraj.urbane_threads.model.User;
import com.shreyraj.urbane_threads.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;

	public List<Review> getAllReview(Long productId);

}
