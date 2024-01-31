package com.shreyraj.urbane_threads.service;

import java.util.List;

import com.shreyraj.urbane_threads.exception.UserException;
import com.shreyraj.urbane_threads.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
