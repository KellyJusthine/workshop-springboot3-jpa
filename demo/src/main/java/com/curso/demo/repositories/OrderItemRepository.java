package com.curso.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.entities.OrderItem;
import com.curso.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
