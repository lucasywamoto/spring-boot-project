package com.lucasywamoto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasywamoto.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
