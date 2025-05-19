package com.example.demo.repository;


import com.example.demo.entity.Item;
import com.example.demo.entity.Order;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Transactional 
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	
	List<Item> findByBoard(Order order);

	
	void deleteByBoard(Order order);

}
