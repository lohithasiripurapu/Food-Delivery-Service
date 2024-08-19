package com.example.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
