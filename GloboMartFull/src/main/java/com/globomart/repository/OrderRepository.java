package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.globomart.model.Order;
import com.globomart.model.projections.OrderDetailsView;

@Repository
@RepositoryRestResource(path="orders",collectionResourceRel="orders",excerptProjection=OrderDetailsView.class)
public interface OrderRepository extends JpaRepository<Order, Long> {

}
