package com.curso.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
