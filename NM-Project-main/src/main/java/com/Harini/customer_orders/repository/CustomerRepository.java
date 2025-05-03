package com.Harini.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Harini.customer_orders.model.Customer;

/**
 * @author Harini S
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
