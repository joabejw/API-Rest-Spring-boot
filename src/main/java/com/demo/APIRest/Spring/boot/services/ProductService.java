package com.demo.APIRest.Spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.APIRest.Spring.boot.entities.Product;
import com.demo.APIRest.Spring.boot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findByID(Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
}
