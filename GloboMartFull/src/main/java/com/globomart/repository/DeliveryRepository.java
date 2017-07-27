package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.globomart.model.Delivery;

@Repository
@RepositoryRestResource(path="deliveryInfo")
public interface DeliveryRepository extends JpaRepository<Delivery,Long > {

}
