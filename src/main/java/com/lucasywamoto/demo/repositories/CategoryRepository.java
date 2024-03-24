package com.lucasywamoto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasywamoto.demo.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
