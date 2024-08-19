package com.example.order.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.Orders;
import com.example.order.service.OrderService;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/new")
	public String addNewOrder(@RequestBody Orders new0rder) {
		
		orderService.addNewOrder(new0rder);
		return "new order Created";
		
	}
	
	@GetMapping
	public Orders getOrder(@RequestParam("orderId") int orderId) {
		
		return orderService.findOrder(orderId);
		
	}
	
	@GetMapping("/exists")
	public boolean existsOrder(@RequestParam("orderId") int orderId) {
		
		return orderService.isOrderExists(orderId);
		
	}
	

}
