package com.example.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.item.model.Item;
import com.example.item.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping
	public Item getItem(@RequestParam("itemId") int itemId) {
		System.out.println(itemService.getItem(itemId).getName());
		
		return itemService.getItem(itemId);
	}
	
	@GetMapping("/exists")
	public boolean isItemExists(@RequestParam("itemId") int itemId) {
		return itemService.isItemExists(itemId);
	}

}
