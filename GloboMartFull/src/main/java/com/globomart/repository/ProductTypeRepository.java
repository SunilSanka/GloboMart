package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.globomart.model.ProductType;

@Repository
@RepositoryRestResource(path="productType")
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

}
