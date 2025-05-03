package com.Harini.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Harini.customer_orders.model.User;

import java.util.Optional;

/**
 * @author Harini S
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
