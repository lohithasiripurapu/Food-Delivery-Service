package com.example.order.service;

import java.util.List;

import com.example.order.model.Orders;

public interface OrderService{
	
	List<Orders> getAllOrders();
	boolean isOrderExists(int orderId);
	Orders findOrder(int orderId);
	void addNewOrder(Orders order);
	
	
	
	

}
