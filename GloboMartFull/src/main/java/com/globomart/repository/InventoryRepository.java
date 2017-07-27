package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.globomart.model.Inventory;

@Repository
@RepositoryRestResource(path="inventoryInfo")
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
