package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.globomart.model.Product;


@Repository
@RepositoryRestResource(path="products",collectionResourceRel="Available Products")
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
