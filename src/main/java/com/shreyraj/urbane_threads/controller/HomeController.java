package com.shreyraj.urbane_threads.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreyraj.urbane_threads.response.ApiResponse;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomeController {

//	@GetMapping("/")
//	public ResponseEntity<ApiResponse> homeController(){
//
//		ApiResponse res=new ApiResponse("Welcome To E-Commerce System", true);
//
//		return new ResponseEntity<>(res,HttpStatus.OK);
//	}

	@GetMapping("/")
	public RedirectView redirectToSwaggerUI() {
		return new RedirectView("/swagger-ui/index.html");
	}
}