package com.example.item.service;

import java.util.List;

import com.example.item.model.Item;

public interface ItemService{
	
	boolean isItemExists(int itemId);
	Item getItem(int itemId);
	List<Item> getAllItems();

}
