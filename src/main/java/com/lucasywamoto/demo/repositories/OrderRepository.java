package com.lucasywamoto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasywamoto.demo.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
