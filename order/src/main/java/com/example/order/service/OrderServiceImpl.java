package com.example.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.model.Orders;
import com.example.order.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public List<Orders> getAllOrders() {
		return orderRepo.findAll();
	}

	@Override
	public boolean isOrderExists(int orderId) {
		if(orderRepo.existsById(orderId)) {
			return true;
		}
		return false;
	}

	@Override
	public Orders findOrder(int orderId) {
		return orderRepo.findById(orderId).get();
	}

	@Override
	public void addNewOrder(Orders order) {
		orderRepo.save(order);
		
	}
	
	

}
