package com.lucasywamoto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasywamoto.demo.entities.OrderItem;
import com.lucasywamoto.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
