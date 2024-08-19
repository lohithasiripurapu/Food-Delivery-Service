package com.example.order.model;

import java.sql.Timestamp;
import java.util.Map;

import com.example.order.converter.MapToJsonConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Convert(converter = MapToJsonConverter.class)
	private Map<Integer, Integer> orderItems;
	
	private Timestamp orderTimestamp;
	
	@PrePersist
	protected void onCreate() {
		
		if(orderTimestamp == null) {
			orderTimestamp = new Timestamp(System.currentTimeMillis());
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, Integer> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Map<Integer, Integer> orderItems) {
		this.orderItems = orderItems;
	}
	public Timestamp getOrderTimestamp() {
		return orderTimestamp;
	}
	public void setOrderTimestamp(Timestamp orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}
}
