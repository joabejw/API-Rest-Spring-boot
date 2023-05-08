package com.demo.APIRest.Spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.APIRest.Spring.boot.entities.Product;
import com.demo.APIRest.Spring.boot.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService productServices;
	
	@GetMapping
	public List<Product> findAll(){
		List<Product> list = productServices.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findByID(@PathVariable("id") Long id) {
		Product product = productServices.findByID(id);
		return ResponseEntity.ok().body(product);
	}
}
