package com.example.item.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.item.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
