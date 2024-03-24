package com.lucasywamoto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasywamoto.demo.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
