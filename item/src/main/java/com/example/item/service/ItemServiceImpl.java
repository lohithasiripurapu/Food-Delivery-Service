package com.example.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.item.model.Item;
import com.example.item.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository itemRepo;

	@Override
	public boolean isItemExists(int itemId) {
		if (itemRepo.existsById(itemId)) {
			return true;
		}
		return false;
	}

	@Override
	public Item getItem(int itemId) {
		return itemRepo.findById(itemId).orElse(null);
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepo.findAll();
	}	

}
