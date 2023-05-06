package com.demo.APIRest.Spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.APIRest.Spring.boot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
