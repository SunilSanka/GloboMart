package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.globomart.model.Order;

@Repository
@RepositoryRestResource(path="orders")
public interface OrderRepository extends JpaRepository<Order, Long> {

}
