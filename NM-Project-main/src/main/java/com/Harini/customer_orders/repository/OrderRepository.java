package com.Harini.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Harini.customer_orders.model.Order;

/**
 * @author Harini S
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
